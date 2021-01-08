package com.dong.skin;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 换肤核心，这里是针对使用 xml 布局控件初始化时候进行资源替换的
 */
public class SkinChangeFactoryDelegate implements LayoutInflater.Factory2 {
    private String TAG = "SkinChangeFactoryDelegate";

    private final Context mContext;
    private SkinCompatViewInflater mSkinCompatViewInflater;
    private List<WeakReference<SkinCompatSupportable>> mSkinHelpers = new CopyOnWriteArrayList<>();

    private SkinChangeFactoryDelegate(Context context) {
        Log.d(TAG, ".......自定义填充器初始化.......");
        mContext = context;
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        Log.d(TAG, ".......自定义View填充器.......");
        View view = createView(parent, name, context, attrs);

        if (view == null) {
            return null;
        }
        if (view instanceof SkinCompatSupportable) {
            mSkinHelpers.add(new WeakReference<>((SkinCompatSupportable) view));
        }

        return view;
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        Log.d(TAG, ".......自定义View填充器.......");
        View view = createView(null, name, context, attrs);

        if (view == null) {
            return null;
        }
        if (view instanceof SkinCompatSupportable) {
            mSkinHelpers.add(new WeakReference<>((SkinCompatSupportable) view));
        }

        return view;
    }


    public View createView(View parent, final String name, Context context,
                           AttributeSet attrs) {
        if (mSkinCompatViewInflater == null) {
            mSkinCompatViewInflater = new SkinCompatViewInflater();
        }

        return mSkinCompatViewInflater.createView(parent, name, context, attrs);
    }

    public static SkinChangeFactoryDelegate create(Context context) {
        return new SkinChangeFactoryDelegate(context);
    }

    public void applySkin(boolean isNightModel) {
        if (mSkinHelpers != null && !mSkinHelpers.isEmpty()) {
            for (WeakReference ref : mSkinHelpers) {
                if (ref != null && ref.get() != null) {
                    // 应用到所有View控件
                    ((SkinCompatSupportable) ref.get()).applySkin(isNightModel);
                }
            }
        }
    }
}

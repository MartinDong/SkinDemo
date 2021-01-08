package com.dong.skin;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.dong.skin.widget.SkinCompatFrameLayout;
import com.dong.skin.widget.SkinCompatImageView;
import com.dong.skin.widget.SkinCompatLinearLayout;
import com.dong.skin.widget.SkinCompatTextView;
import com.dong.skin.widget.SkinCompatToggleButton;

/**
 * 填充布局核心
 */
public class SkinCompatViewInflater {
    private String TAG = "SkinCompatViewInflater";

    public final View createView(View parent, final String name, Context context, AttributeSet attrs) {
        Log.d(TAG, ".......createView.......");
        View view = null;
        if (name.contains(".")) {
            return null;
        }
        switch (name) {
            case "TextView":
                view = new SkinCompatTextView(context, attrs);
                break;
            case "ToggleButton":
                view = new SkinCompatToggleButton(context, attrs);
                break;
            case "ImageView":
                view = new SkinCompatImageView(context, attrs);
                break;
            case "LinearLayout":
                view = new SkinCompatLinearLayout(context, attrs);
                break;
            case "FrameLayout":
                view = new SkinCompatFrameLayout(context, attrs);
                break;
            default:
                Log.e(TAG, "该控件还未支持......");
                break;
        }

        return view;
    }


}

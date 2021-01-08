package com.dong.skin.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.dong.skin.SkinCompatSupportable;

/**
 * 帧布局换肤
 */
public class SkinCompatFrameLayout extends FrameLayout implements SkinCompatSupportable {
    public SkinCompatFrameLayout(Context context) {
        super(context);
    }

    public SkinCompatFrameLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SkinCompatFrameLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void applySkin(boolean isNightModel) {

    }
}

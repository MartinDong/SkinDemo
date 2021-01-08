package com.dong.skin.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.dong.skin.SkinCompatSupportable;
import com.dong.skindemo.R;

/**
 * 线性布局换肤
 */
public class SkinCompatLinearLayout extends LinearLayout implements SkinCompatSupportable {
    public SkinCompatLinearLayout(Context context) {
        super(context);
    }

    public SkinCompatLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SkinCompatLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void applySkin(boolean isNightModel) {
        if (isNightModel) {
            setBackgroundColor(getResources().getColor(R.color.colorBackground_Night));
        } else {
            setBackgroundColor(getResources().getColor(R.color.colorBackground_Day));
        }
    }
}

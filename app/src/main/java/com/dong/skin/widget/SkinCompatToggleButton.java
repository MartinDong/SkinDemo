package com.dong.skin.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatToggleButton;

import com.dong.skin.SkinCompatSupportable;

/**
 * 切换按钮换肤
 */
public class SkinCompatToggleButton extends AppCompatToggleButton implements SkinCompatSupportable {
    public SkinCompatToggleButton(Context context) {
        super(context);
    }

    public SkinCompatToggleButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SkinCompatToggleButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void applySkin(boolean isNightModel) {

    }
}

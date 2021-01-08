package com.dong.skin.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

import com.dong.skin.SkinCompatSupportable;
import com.dong.skindemo.R;

/**
 * 图片换肤
 */
public class SkinCompatImageView extends AppCompatImageView implements SkinCompatSupportable {
    public SkinCompatImageView(@NonNull Context context) {
        super(context);
    }

    public SkinCompatImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SkinCompatImageView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void applySkin(boolean isNightModel) {

        if (isNightModel) {
            setImageResource(R.drawable.ic_text_night);
        } else {
            setImageResource(R.drawable.ic_text_day);
        }
    }
}

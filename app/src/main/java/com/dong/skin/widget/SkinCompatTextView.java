package com.dong.skin.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import com.dong.skin.SkinCompatSupportable;
import com.dong.skindemo.R;

/**
 * 文本控件支持换肤
 */
public class SkinCompatTextView extends AppCompatTextView implements SkinCompatSupportable {
    public SkinCompatTextView(Context context) {
        this(context, null);
    }

    public SkinCompatTextView(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.textViewStyle);
    }

    public SkinCompatTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void applySkin(boolean isNightModel) {

        if (isNightModel) {
            setTextColor(getResources().getColor(R.color.colorText_Night));
        } else {
            setTextColor(getResources().getColor(R.color.colorText_Day));
        }

    }
}

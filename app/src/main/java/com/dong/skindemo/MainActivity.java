package com.dong.skindemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.core.view.LayoutInflaterCompat;

import com.dong.skin.SkinChangeFactoryDelegate;

/**
 * 测试换肤
 */
public class MainActivity extends Activity {

    private String TAG = "MainActivity";

    private SkinChangeFactoryDelegate mSkinChangeFactoryDelegate;
    private ToggleButton tbChangeSkinModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 创建布局管理器
        mSkinChangeFactoryDelegate = SkinChangeFactoryDelegate.create(this);
        // 获取原始的布局管理器
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        // 设置新的布局管理器
        LayoutInflaterCompat.setFactory2(layoutInflater, mSkinChangeFactoryDelegate);

        // 设置填充的布局
        setContentView(R.layout.activity_main);

        tbChangeSkinModel = findViewById(R.id.tbChangeSkinModel);
        tbChangeSkinModel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Log.d(TAG, "切换皮肤:" + "  夜间模式");
                } else {
                    Log.d(TAG, "切换皮肤:" + "  白天模式");
                }
                // 切换皮肤
                mSkinChangeFactoryDelegate.applySkin(isChecked);
            }
        });
    }


}

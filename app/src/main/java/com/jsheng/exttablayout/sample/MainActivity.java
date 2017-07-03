package com.jsheng.exttablayout.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.jsheng.exttablayout.sample.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.button)
    Button mCustomWidth;

    @BindView(R.id.button2)
    Button mWithoutPadding;

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCustomWidth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomWidthActivity.class));
            }
        });
        mWithoutPadding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WithoutPaddingActivity.class));
            }
        });
    }
}

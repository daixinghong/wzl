package com.wole.wozhilian;

import android.os.Bundle;

import com.wole.wozhilian.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

    }

    @Override
    public int getContentView() {
        return R.layout.activity_main;
    }

    private void init() {

    }


}

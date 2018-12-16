package com.wole.wozhilian.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wole.wozhilian.R;
import com.wole.wozhilian.utils.Constant;
import com.wole.wozhilian.utils.SpUtils;
import com.wole.wozhilian.utils.ToastUtils;
import com.wole.wozhilian.utils.UiUtils;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());

        ButterKnife.bind(this);
    }

    public abstract int  getContentView();


    public void getDataError(Throwable throwable) {

        ToastUtils.showTextToast(UiUtils.getString(R.string.network_error));
    }

    public String getToken() {
        return (String) SpUtils.getParam(this, Constant.TOKEN,"");
    }

}

package com.wole.wozhilian.login.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.wole.wozhilian.R;
import com.wole.wozhilian.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterUserActivity extends BaseActivity {

    @BindView(R.id.et_phone_number)
    EditText mEtPhoneNumber;
    @BindView(R.id.et_check_code)
    EditText mEtCheckCode;
    @BindView(R.id.tv_get_check_code)
    TextView mTvGetCheckCode;
    @BindView(R.id.et_password)
    EditText mEtPassword;
    @BindView(R.id.btn_login)
    Button mBtnLogin;
    @BindView(R.id.tv_user)
    TextView mTvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_user_view);
        ButterKnife.bind(this);

        init();


    }

    @Override
    public int getContentView() {
        return R.layout.register_user_view;
    }

    private void init() {

    }


    @OnClick({R.id.tv_get_check_code, R.id.btn_login})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_get_check_code:
                break;
            case R.id.btn_login:
                break;
        }
    }
}

package com.wole.wozhilian.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.wole.wozhilian.R;
import com.wole.wozhilian.home.view.activity.HomeActivity;
import com.wole.wozhilian.login.view.ForgetPasswordActivity;
import com.wole.wozhilian.utils.IntentUtils;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etInputUserName;
    private EditText etInputPassword;
    private Button btnLogin;
    private TextView tvForgetPassword;
    private ImageView ivRememberPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        initData();

        initEvent();
    }

    private void initView() {

        etInputUserName = findViewById(R.id.et_input_user_name);
        etInputPassword = findViewById(R.id.et_input_password);
        btnLogin = findViewById(R.id.btn_login);
        tvForgetPassword = findViewById(R.id.tv_forget_password);
        ivRememberPassword = findViewById(R.id.iv_remember_password);

    }

    private void initData() {

    }

    private void initEvent() {
        tvForgetPassword.setOnClickListener(this);
        ivRememberPassword.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_forget_password:
                IntentUtils.startActivity(this, ForgetPasswordActivity.class);
                break;
            case R.id.iv_remember_password:

                break;
            case R.id.btn_login:
                IntentUtils.startActivity(this, HomeActivity.class);
                break;
        }
    }
}

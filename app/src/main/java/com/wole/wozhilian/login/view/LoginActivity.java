package com.wole.wozhilian.login.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.wole.wozhilian.R;
import com.wole.wozhilian.base.BaseActivity;
import com.wole.wozhilian.home.view.activity.HomeActivity;
import com.wole.wozhilian.login.model.LoginBean;
import com.wole.wozhilian.login.presenter.LoginAndRegisterInterface;
import com.wole.wozhilian.login.presenter.LoginAndRegisterPresenter;
import com.wole.wozhilian.utils.Constant;
import com.wole.wozhilian.utils.IntentUtils;
import com.wole.wozhilian.utils.SpUtils;
import com.wole.wozhilian.utils.ToastUtils;
import com.wole.wozhilian.utils.UiUtils;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends BaseActivity implements View.OnClickListener, LoginAndRegisterInterface {

    private EditText etInputUserName;
    private EditText etInputPassword;
    private Button btnLogin;
    private TextView tvForgetPassword;
    private ImageView ivRememberPassword;
    private LoginAndRegisterPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();

        initData();

        initEvent();
    }

    @Override
    public int getContentView() {

        return R.layout.activity_login;
    }

    private void initView() {

        etInputUserName = findViewById(R.id.et_input_user_name);
        etInputPassword = findViewById(R.id.et_input_password);
        btnLogin = findViewById(R.id.btn_login);
        tvForgetPassword = findViewById(R.id.tv_forget_password);
        ivRememberPassword = findViewById(R.id.iv_remember_password);

    }

    private void initData() {

        mPresenter = new LoginAndRegisterPresenter(this);

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

                if (TextUtils.isEmpty(etInputUserName.getText().toString().trim())) {
                    ToastUtils.showTextToast(UiUtils.getString(R.string.not_input_user));
                    return;
                }

                if (TextUtils.isEmpty(etInputPassword.getText().toString().trim())) {
                    ToastUtils.showTextToast(UiUtils.getString(R.string.not_input_password));
                    return;
                }

                mPresenter.login();

                break;
        }
    }

    @Override
    public void loginSuccess(LoginBean loginBean) {

        switch (loginBean.getCode()) {
            case 200:

                SpUtils.putParms(this, Constant.TOKEN, loginBean.getAccess_token());
                SpUtils.putParms(this,Constant.USER,loginBean.getU());
                SpUtils.putParms(this,Constant.PASSWORD,etInputPassword.getText().toString().trim());
                ToastUtils.showTextToast(UiUtils.getString(R.string.login_success));
                IntentUtils.startActivity(this, HomeActivity.class);

                break;
            case 403:
                ToastUtils.showTextToast(loginBean.getError());
                break;
        }
    }

    @Override
    public Map<String, Object> getMap() {

        Map<String, Object> map = new HashMap<>();
        map.put("m", "login");
        map.put("u", etInputUserName.getText().toString().trim());
        map.put("p", etInputPassword.getText().toString().trim());

        return null;
    }


    @Override
    public String getUserName() {
        return etInputUserName.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return etInputPassword.getText().toString().trim();
    }

    @Override
    public String getMethod() {
        return "login";
    }
}

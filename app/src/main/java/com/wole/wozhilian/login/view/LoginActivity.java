package com.wole.wozhilian.login.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginAndRegisterInterface {


    @BindView(R.id.img_logo)
    ImageView mImgLogo;
    @BindView(R.id.iv_login_user)
    ImageView mIvLoginUser;
    @BindView(R.id.et_input_user_name)
    EditText mEtInputUserName;
    @BindView(R.id.lr_login_user)
    RelativeLayout mLrLoginUser;
    @BindView(R.id.iv_login_password)
    ImageView mIvLoginPassword;
    @BindView(R.id.et_input_password)
    EditText mEtInputPassword;
    @BindView(R.id.ll_login_info)
    LinearLayout mLlLoginInfo;
    @BindView(R.id.btn_login)
    Button mBtnLogin;
    @BindView(R.id.iv_remember_password)
    ImageView mIvRememberPassword;
    @BindView(R.id.tv_forget_password)
    TextView mTvForgetPassword;
    private LoginAndRegisterPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        init();

    }

    @Override
    public int getContentView() {

        return R.layout.activity_login;
    }


    private void init() {
        mPresenter = new LoginAndRegisterPresenter(this);
    }


    @OnClick({R.id.btn_login, R.id.iv_remember_password, R.id.tv_forget_password})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                if (TextUtils.isEmpty(mEtInputUserName.getText().toString().trim())) {
                    ToastUtils.showTextToast(UiUtils.getString(R.string.not_input_user));
                    return;
                }
                if (TextUtils.isEmpty(mEtInputPassword.getText().toString().trim())) {
                    ToastUtils.showTextToast(UiUtils.getString(R.string.not_input_password));
                    return;
                }
                mPresenter.login();
                break;
            case R.id.iv_remember_password:
                break;
            case R.id.tv_forget_password:
                IntentUtils.startActivity(this, ForgetPasswordActivity.class);
                break;
        }
    }


    @Override
    public void loginSuccess(LoginBean loginBean) {

        switch (loginBean.getCode()) {
            case 200:

                SpUtils.putParms(this, Constant.TOKEN, loginBean.getAccess_token());
                SpUtils.putParms(this, Constant.USER, loginBean.getU());
                SpUtils.putParms(this, Constant.PASSWORD, mEtInputPassword.getText().toString().trim());
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
        map.put("u", mEtInputUserName.getText().toString().trim());
        map.put("p", mEtInputPassword.getText().toString().trim());

        return null;
    }


    @Override
    public String getUserName() {
        return mEtInputUserName.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return mEtInputPassword.getText().toString().trim();
    }

    @Override
    public String getMethod() {
        return "login";
    }


}

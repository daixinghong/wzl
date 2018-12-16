package com.wole.wozhilian.login.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wole.wozhilian.R;
import com.wole.wozhilian.base.BaseActivity;
import com.wole.wozhilian.utils.UiUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class ForgetPasswordActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.rl_back)
    RelativeLayout mRlBack;
    @BindView(R.id.tv_base_title)
    TextView mTvBaseTitle;
    @BindView(R.id.et_phone_number)
    EditText mEtPhoneNumber;
    @BindView(R.id.et_check_code)
    EditText mEtCheckCode;
    @BindView(R.id.tv_get_check_code)
    TextView mTvGetCheckCode;
    @BindView(R.id.btn_next_step)
    Button mBtnNextStep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

    }

    @Override
    public int getContentView() {
        return R.layout.activity_forget_password;
    }

    private void init() {
        mTvBaseTitle.setText(UiUtils.getColor(R.string.forget_password));
    }


    @OnClick({R.id.rl_back, R.id.et_check_code, R.id.btn_next_step})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_back:
                break;
            case R.id.et_check_code:
                break;
            case R.id.btn_next_step:
                break;
        }
    }
}

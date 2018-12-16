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

public class ModifyPasswordActivity extends BaseActivity {


    @BindView(R.id.rl_back)
    RelativeLayout mRlBack;
    @BindView(R.id.tv_base_title)
    TextView mTvBaseTitle;
    @BindView(R.id.et_paimary_password)
    EditText mEtPaimaryPassword;
    @BindView(R.id.et_new_password)
    EditText mEtNewPassword;
    @BindView(R.id.et_confirm_password)
    EditText mEtConfirmPassword;
    @BindView(R.id.btn_confirm)
    Button mBtnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

    }

    @Override
    public int getContentView() {
        return R.layout.activity_modify_password;
    }

    private void init() {
        mTvBaseTitle.setText(UiUtils.getString(R.string.primary_password));

    }


    @OnClick({R.id.rl_back, R.id.btn_confirm})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_back:
                finish();
                break;
            case R.id.btn_confirm:
                break;
        }
    }
}

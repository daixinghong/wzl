package com.wole.wozhilian.login.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wole.wozhilian.R;
import com.wole.wozhilian.utils.UiUtils;

public class ModifyPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout mRlBack;
    private EditText mEtPaimaryPassword;
    private EditText mEtNewPassword;
    private EditText mEtConfirmPassword;
    private Button mBtnNextStep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_password);

        initView();

        initData();

        initEvent();

    }

    private void initView() {
        TextView tvTitle = findViewById(R.id.tv_base_title);
        tvTitle.setText(UiUtils.getString(R.string.primary_password));
        mRlBack = findViewById(R.id.rl_back);
        mEtPaimaryPassword = findViewById(R.id.et_paimary_password);
        mEtNewPassword = findViewById(R.id.et_new_password);
        mEtConfirmPassword = findViewById(R.id.et_confirm_password);
        mBtnNextStep = findViewById(R.id.btn_confirm);
    }

    private void initData() {

    }

    private void initEvent() {
        mRlBack.setOnClickListener(this);
        mBtnNextStep.setOnClickListener(this);
    }

    @Override
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

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

public class ForgetPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout rlBack;
    private EditText etPhoneNumber;
    private EditText etCheckCode;
    private TextView tvGetCheckCode;
    private Button btnNextStep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        initView();

        initData();

        initEvent();


    }

    private void initView() {
        rlBack = findViewById(R.id.rl_back);
        TextView tvTitle = findViewById(R.id.tv_base_title);
        tvTitle.setText(UiUtils.getString(R.string.forget_password_title));
        etPhoneNumber = findViewById(R.id.et_phone_number);
        etCheckCode = findViewById(R.id.et_check_code);
        tvGetCheckCode = findViewById(R.id.tv_get_check_code);
        btnNextStep = findViewById(R.id.btn_next_step);
    }

    private void initData() {

    }

    private void initEvent() {
        rlBack.setOnClickListener(this);
        tvGetCheckCode.setOnClickListener(this);
        btnNextStep.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rl_back:
                finish();
                break;
            case R.id.tv_get_check_code:

                break;
            case R.id.btn_next_step:

                break;
        }
    }

}

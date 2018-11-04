package com.wole.wozhilian.home.view.activity;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wole.wozhilian.R;
import com.wole.wozhilian.home.view.fragment.DevicesFragment;
import com.wole.wozhilian.home.view.fragment.HintFragment;
import com.wole.wozhilian.home.view.fragment.HomeFragment;
import com.wole.wozhilian.utils.Constant;

public class HomeActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup rgGroup;
    private RadioButton rbWork;
    private RadioButton rbDevices;
    private RadioButton rbHint;
    private HomeFragment mHomeFragment;
    private DevicesFragment mDevicesFragment;
    private HintFragment mHintFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();

        initData();

        initEvent();
    }

    private void initView() {
        rgGroup = findViewById(R.id.rd_group);
        rbWork = findViewById(R.id.rb_work);
        rbDevices = findViewById(R.id.rd_my_devices);
        rbHint = findViewById(R.id.rb_hint);

    }

    private void initData() {

    }

    public void hideAllFragment(FragmentTransaction transaction) {
        if (mHomeFragment != null) {
            transaction.hide(mHomeFragment);
        }
        if (mDevicesFragment != null) {
            transaction.hide(mDevicesFragment);
        }
        if (mHintFragment != null) {
            transaction.hide(mHintFragment);
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        Bundle bundleExtra = getIntent().getBundleExtra(Constant.BUNDLE_PARMS);
        int index = 0;
        if (bundleExtra != null) {
            index = bundleExtra.getInt(Constant.KEY, 1);
        }
        switch (index) {
            case 0:
                rbWork.setChecked(true);
                break;
            case 1:
                rbDevices.setChecked(true);
                break;
            case 2:
                rbHint.setChecked(true);
                break;
        }
    }


    private void initEvent() {
        rgGroup.setOnCheckedChangeListener(this);
        rbWork.setChecked(true);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int i) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        hideAllFragment(transaction);
        switch (i) {
            case R.id.rb_work:
                if (mHomeFragment == null) {
                    mHomeFragment = new HomeFragment();
                    transaction.add(R.id.fragment_container, mHomeFragment);
                } else {
                    transaction.show(mHomeFragment);
                }
                break;
            case R.id.rd_my_devices:
                if (mDevicesFragment == null) {
                    mDevicesFragment = new DevicesFragment();
                    transaction.add(R.id.fragment_container, mDevicesFragment);
                } else {
                    transaction.show(mDevicesFragment);
                }
                break;
            case R.id.rb_hint:
                if (mHintFragment == null) {
                    mHintFragment = new HintFragment();
                    transaction.add(R.id.fragment_container, mHintFragment);
                } else {
                    transaction.show(mHintFragment);
                }
                break;
        }

        transaction.commit();
    }
}

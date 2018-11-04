package com.wole.wozhilian.home.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.dinuscxj.progressbar.CircleProgressBar;
import com.wole.wozhilian.R;
import com.wole.wozhilian.home.adapter.RcyDevicesOutCountAdapter;
import com.wole.wozhilian.utils.UiUtils;

public class DevicesStatusActivity extends AppCompatActivity {

    private ImageView mIvPhoto;
    private RecyclerView mRcyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices_status);

        initView();

        initData();

        initEvent();

    }

    private void initView() {
        TextView tvTitle = findViewById(R.id.tv_base_title);
        tvTitle.setText(UiUtils.getString(R.string.device_status));
        mIvPhoto = findViewById(R.id.iv_photo);
        CircleProgressBar circleProgressBar1 = findViewById(R.id.custom1);
        circleProgressBar1.setProgress(75);
        CircleProgressBar circleProgressBar2 = findViewById(R.id.custom2);
        circleProgressBar2.setProgress(60);
        CircleProgressBar circleProgressBar3 = findViewById(R.id.custom3);
        circleProgressBar3.setProgress(38);
        mRcyList = findViewById(R.id.rcy_out_count_list);
        LinearLayoutManager manager = new LinearLayoutManager(this) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        mRcyList.setLayoutManager(manager);

    }

    private void initData() {
        RcyDevicesOutCountAdapter adapter = new RcyDevicesOutCountAdapter(this, null);
        mRcyList.setAdapter(adapter);
    }

    private void initEvent() {

    }
}

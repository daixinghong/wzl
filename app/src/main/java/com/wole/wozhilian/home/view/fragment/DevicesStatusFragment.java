package com.wole.wozhilian.home.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dinuscxj.progressbar.CircleProgressBar;
import com.wole.wozhilian.R;
import com.wole.wozhilian.home.adapter.RcyDevicesOutCountAdapter;

/**
 * Created by Administrator on 2018/9/15.
 */

public class DevicesStatusFragment extends Fragment {
    private RecyclerView mRcyList;
    private ImageView mIvPhoto;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.activity_devices_status, null);

        initView(inflate);

        initData();

        initEvent();

        return inflate;
    }

    private void initView(View inflate) {
        mIvPhoto = inflate.findViewById(R.id.iv_photo);
        CircleProgressBar circleProgressBar1 = inflate.findViewById(R.id.custom1);
        circleProgressBar1.setProgress(75);
        CircleProgressBar circleProgressBar2 = inflate.findViewById(R.id.custom2);
        circleProgressBar2.setProgress(60);
        CircleProgressBar circleProgressBar3 = inflate.findViewById(R.id.custom3);
        circleProgressBar3.setProgress(38);
        mRcyList = inflate.findViewById(R.id.rcy_out_count_list);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity()) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        mRcyList.setLayoutManager(manager);
        mRcyList.setNestedScrollingEnabled(false);
    }

    private void initData() {
        RcyDevicesOutCountAdapter adapter = new RcyDevicesOutCountAdapter(getActivity(), null);
        mRcyList.setAdapter(adapter);
    }

    private void initEvent() {

    }
}

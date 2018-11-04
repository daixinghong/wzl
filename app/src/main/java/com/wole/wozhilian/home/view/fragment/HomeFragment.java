package com.wole.wozhilian.home.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.wole.wozhilian.R;
import com.wole.wozhilian.home.adapter.RcyHomeAdapter;

/**
 * Created by Administrator on 2018/9/13.
 */

public class HomeFragment extends Fragment {


    private RecyclerView rcyDevices;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_home_view, null);

        initView(inflate);

        initData();

        initEvent();

        return inflate;
    }

    private void initEvent() {

    }

    private void initData() {
        RcyHomeAdapter adapter = new RcyHomeAdapter(getActivity(), null);
        rcyDevices.setAdapter(adapter);
    }

    private void initView(View inflate) {

        ImageView ivBanner = inflate.findViewById(R.id.iv_banner);
        rcyDevices = inflate.findViewById(R.id.rcy_devices);
        rcyDevices.setLayoutManager(new GridLayoutManager(getActivity(), 3));

    }
}

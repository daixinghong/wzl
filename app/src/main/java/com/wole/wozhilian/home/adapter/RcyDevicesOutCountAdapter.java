package com.wole.wozhilian.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wole.wozhilian.R;

import java.util.List;

/**
 * Created by Administrator on 2018/9/14.
 */

public class RcyDevicesOutCountAdapter extends RecyclerView.Adapter<RcyDevicesOutCountAdapter.DevicesHoder> {
    private Context mContext;
    private List<String> mList;
    private RcyHomeAdapter.OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void setOnItemClickListener(View view, int position);
    }

    public void setOnItemClickListener(RcyHomeAdapter.OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public RcyDevicesOutCountAdapter(Context context, List<String> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public DevicesHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        DevicesHoder holder = new DevicesHoder(LayoutInflater.from(
                mContext).inflate(R.layout.rcy_devices_out_count_item, null,
                false), mOnItemClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(DevicesHoder holder, final int position) {


    }


    @Override
    public int getItemCount() {
        return mList == null ? 1 : mList.size();
    }


    class DevicesHoder extends RecyclerView.ViewHolder {


        public DevicesHoder(View itemView, RcyHomeAdapter.OnItemClickListener onItemClickListener) {
            super(itemView);

        }


    }
}

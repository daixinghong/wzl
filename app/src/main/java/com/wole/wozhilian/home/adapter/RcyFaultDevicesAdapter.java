package com.wole.wozhilian.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wole.wozhilian.R;

import java.util.List;

/**
 * Created by Administrator on 2018/9/18.
 */

public class RcyFaultDevicesAdapter extends RecyclerView.Adapter<RcyFaultDevicesAdapter.HintHolder> {

    private Context mContext;
    private List<String> mList;
    private RcyHomeAdapter.OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void setOnItemClickListener(View view, int position);
    }

    public void setOnItemClickListener(RcyHomeAdapter.OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public RcyFaultDevicesAdapter(Context context, List<String> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public HintHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        HintHolder holder = new HintHolder(LayoutInflater.from(
                mContext).inflate(R.layout.rcy_devices_fault_list_item, parent,
                false), mOnItemClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(HintHolder holder, final int position) {


    }


    @Override
    public int getItemCount() {
        return mList == null ? 5 : mList.size();
    }


    class HintHolder extends RecyclerView.ViewHolder {


        public HintHolder(View itemView, RcyHomeAdapter.OnItemClickListener onItemClickListener) {
            super(itemView);

        }


    }
}

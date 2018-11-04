package com.wole.wozhilian.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wole.wozhilian.R;
import com.wole.wozhilian.utils.UiUtils;

import java.util.List;

/**
 * Created by Administrator on 2018/9/13.
 */

public class RcyHomeAdapter extends RecyclerView.Adapter<RcyHomeAdapter.HomeHolder> {


    private Context mContext;
    private List<String> mList;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void setOnItemClickListener(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public RcyHomeAdapter(Context context, List<String> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public HomeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        HomeHolder holder = new HomeHolder(LayoutInflater.from(
                mContext).inflate(R.layout.rcy_home_item_view, null,
                false), mOnItemClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(HomeHolder holder, final int position) {

        switch (position) {
            case 0:
                holder.mTvName.setText(UiUtils.getString(R.string.all_devices_count));
                holder.mIvRound.setImageResource(R.drawable.bule_round);
                break;
            case 1:
                holder.mTvName.setText(UiUtils.getString(R.string.up_line_count));
                holder.mIvRound.setImageResource(R.drawable.green_round);
                break;
            case 2:
                holder.mTvName.setText(UiUtils.getString(R.string.down_line_count));
                holder.mIvRound.setImageResource(R.drawable.red_round);
                break;
        }

    }


    @Override
    public int getItemCount() {
        return mList == null ? 3 : mList.size();
    }


    class HomeHolder extends RecyclerView.ViewHolder {


        private final ImageView mIvRound;
        private final TextView mTvCount;
        private final TextView mTvName;

        public HomeHolder(View itemView, OnItemClickListener onItemClickListener) {
            super(itemView);
            mIvRound = itemView.findViewById(R.id.iv_round);
            mTvCount = itemView.findViewById(R.id.tv_count);
            mTvName = itemView.findViewById(R.id.tv_name);
        }


    }
}

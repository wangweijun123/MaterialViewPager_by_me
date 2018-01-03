package com.richeditor.wangweijun1.materialviewpager_by_me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.florent37.materialviewpager.header.MaterialViewPagerHeaderDecorator;

/**
 * Created by wangweijun1 on 2018/1/2.
 */

public class GameInfomationFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View homeView = View.inflate(getActivity(), R.layout.fragment_game_infomation, null);
        RecyclerView recyclerView = (RecyclerView)homeView.findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.addItemDecoration(new MaterialViewPagerHeaderDecorator());
        recyclerView.setAdapter(new GameInfomationAdapter());
        return homeView;
    }

    class GameInfomationAdapter extends RecyclerView.Adapter<MyViewHolder> {


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_rank, parent, false);
            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            BaseModel baseModel = new BaseModel();
            baseModel.name = "position:"+position;
            holder.nameTextView.setText(baseModel.name);
            holder.itemView.setTag(baseModel);
        }

        @Override
        public int getItemCount() {
            return 20;
        }


    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView avatarView;
        TextView nameTextView;
        TextView emailTextView;
        public MyViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.text_name);
        }
    }

}

package com.richeditor.wangweijun1.materialviewpager_by_me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by wangweijun1 on 2018/1/2.
 */

public class GameInfomationFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View homeView = View.inflate(getActivity(), R.layout.fragment_game_infomation, null);
        ListView listView = (ListView)homeView.findViewById(R.id.listView);
        listView.setAdapter(new GameInfomationAdapter());
        return homeView;
    }

    class GameInfomationAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView tv = new TextView(getActivity().getBaseContext());
            tv.setText("positon:"+i);
            tv.setTextSize(40);
            return tv;
        }
    }

}

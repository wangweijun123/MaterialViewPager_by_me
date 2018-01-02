package com.richeditor.wangweijun1.materialviewpager_by_me;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.github.florent37.materialviewpager.MaterialViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private MaterialViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (MaterialViewPager) findViewById(R.id.materialViewPager);

        List<BaseModel> list = new ArrayList<>();
        for (int i=0; i<10; i++) {
            BaseModel baseModel = new BaseModel();

            list.add(baseModel);
        }
        ViewPager viewPager = mViewPager.getViewPager();
        viewPager.setAdapter(new HomeAdapter(getSupportFragmentManager(), list));

//After set an adapter to the ViewPager
        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());
    }


    class HomeAdapter extends FragmentPagerAdapter {
        private List<BaseModel> tags;

        public HomeAdapter(FragmentManager fm, List<BaseModel> appDetailsItems) {
            super(fm);
            this.tags = appDetailsItems;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tags.get(position).name;
        }

        @Override
        public int getCount() {
            return tags.size();
        }

        @Override
        public Fragment getItem(int position) {
            Log.i("wang", "getItem position:"+position);
            return new GameInfomationFragment();
        }
    }

}

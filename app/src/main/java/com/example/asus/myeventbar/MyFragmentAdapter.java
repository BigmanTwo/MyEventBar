package com.example.asus.myeventbar;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Asus on 2016/6/7.
 */
public class MyFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> mLlist;

    public MyFragmentAdapter(FragmentManager fm, List<Fragment> mLlist) {
        super(fm);

        this.mLlist = mLlist;
    }


    @Override
    public Fragment getItem(int position) {
        return mLlist.get(position);
    }

    @Override
    public int getCount() {
        return mLlist.size();
    }
}

package com.jsheng.exttablayout.sample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.jsheng.exttablayout.sample.base.BaseFragment;

import java.util.ArrayList;

/**
 * Created by 十六楼的小盛 on 2017/6/30.
 */

public class HomePagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<BaseFragment> mFragmentList;
    private ArrayList<String> mTitleList;

    public HomePagerAdapter(FragmentManager fm,
                            ArrayList<BaseFragment> fragments, ArrayList<String> titles) {
        super(fm);
        mFragmentList = fragments;
        mTitleList = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }
}

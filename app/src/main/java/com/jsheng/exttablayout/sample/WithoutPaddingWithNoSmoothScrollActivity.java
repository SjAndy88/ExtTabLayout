package com.jsheng.exttablayout.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import com.jsheng.exttablayout.sample.base.BaseActivity;
import com.jsheng.exttablayout.sample.base.BaseFragment;
import com.jsheng.exttablayout.sample.content.ContentFragment;
import com.jsheng.exttablayout.widget.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;

public class WithoutPaddingWithNoSmoothScrollActivity extends BaseActivity {


    @BindView(R.id.home_tab_layout)
    TabLayout mHomeTabLayout;

    @BindView(R.id.home_pager)
    ViewPager mHomeViewPager;

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_without_padding;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HomePagerAdapter adapter = new HomePagerAdapter(getSupportFragmentManager(), getFragmentList(), getTitleList());
        mHomeViewPager.setAdapter(adapter);
        mHomeTabLayout.setupWithViewPager(mHomeViewPager);
    }

    private ArrayList<BaseFragment> getFragmentList() {
        ArrayList<BaseFragment> fragments = new ArrayList<>(10);
        fragments.add(ContentFragment.newInstance(android.R.color.holo_blue_bright, R.string.home_tab_recommend));
        fragments.add(ContentFragment.newInstance(android.R.color.holo_green_dark, R.string.home_tab_finance));
        fragments.add(ContentFragment.newInstance(android.R.color.holo_orange_dark, R.string.home_tab_live));
        fragments.add(ContentFragment.newInstance(android.R.color.holo_green_light, R.string.home_tab_thought));
        fragments.add(ContentFragment.newInstance(android.R.color.holo_orange_light, R.string.home_tab_ask));
        fragments.add(ContentFragment.newInstance(android.R.color.holo_blue_dark, R.string.home_tab_video));
        fragments.add(ContentFragment.newInstance(android.R.color.holo_red_dark, R.string.home_tab_pastime));
        fragments.add(ContentFragment.newInstance(android.R.color.holo_red_light, R.string.home_tab_military));
        fragments.add(ContentFragment.newInstance(android.R.color.holo_blue_light, R.string.home_tab_event));
        return fragments;
    }

    private ArrayList<String> getTitleList() {
        ArrayList<String> titles = new ArrayList<>(7);
        titles.add(getString(R.string.home_tab_recommend));
        titles.add(getString(R.string.home_tab_finance));
        titles.add(getString(R.string.home_tab_live));
        titles.add(getString(R.string.home_tab_thought));
        titles.add(getString(R.string.home_tab_ask));
        titles.add(getString(R.string.home_tab_video));
        titles.add(getString(R.string.home_tab_pastime));
        titles.add(getString(R.string.home_tab_military));
        titles.add(getString(R.string.home_tab_event));
        return titles;
    }
}

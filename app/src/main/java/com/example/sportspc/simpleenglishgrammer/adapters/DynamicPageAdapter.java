package com.example.sportspc.simpleenglishgrammer.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sportspc.simpleenglishgrammer.ui.fragments.DynamicPage;
import com.example.sportspc.simpleenglishgrammer.utilhelpers.InitialiseData;

/**
 * Created by SportsPc on 11/19/2017.
 */

public class DynamicPageAdapter extends FragmentStatePagerAdapter {
    @Override
    public Fragment getItem(int position) {
        return  DynamicPage.newInstance(position);
    }
    public DynamicPageAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public int getCount() {
        return InitialiseData.data.size();
    }
}

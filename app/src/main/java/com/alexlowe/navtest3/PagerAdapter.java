package com.alexlowe.navtest3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by dell on 2/10/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(android.support.v4.app.FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return DemoFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab #" + (position + 1);
    }
}

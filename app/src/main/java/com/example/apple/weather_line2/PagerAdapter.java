package com.example.apple.weather_line2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by 张越 on on 17-6-4.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    String[] locations = {"珠海","柳州","北京"};
    String[] temperature = {"27","31","16"};
    private static final int TOTAL_PAGE_COUNT = 3;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        WeatherPageFragment fragment = new WeatherPageFragment();
        fragment.setLocationName(locations[position]);
        fragment.setTemperature(temperature[position]);
        return fragment;
    }

    @Override
    public int getCount() {
        return TOTAL_PAGE_COUNT;
    }

}

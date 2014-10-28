package com.example.effervescencemmxiv;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.effervescencemmxiv.Day1;
import com.example.effervescencemmxiv.Day2;
import com.example.effervescencemmxiv.Day3;


	public class TabsPagerAdapter extends FragmentPagerAdapter {
		 
	    public TabsPagerAdapter(FragmentManager fm) {
	        super(fm);
	    }
	 
	    @Override
	    public Fragment getItem(int index) {
	 
	        switch (index) {
	        case 0:
	            return new Day1();
	        case 1:
	            return new Day2();
	        case 2:
	            return new Day3();
	        }
	 
	        return null;
	    }
	 
	    @Override
	    public int getCount() {
	        // get item count - equal to number of tabs
	        return 3;
	    }
	 
}

package com.quinbay.androidtraining.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.quinbay.androidtraining.fragments.ListViewFragment;
import com.quinbay.androidtraining.fragments.RecyclerViewFragment;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<CharSequence> list;
    public ViewPagerAdapter(@NonNull FragmentManager fm,ArrayList<CharSequence> list) {
        super(fm);
        this.list=list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        if(position==0)
        {
            fragment= ListViewFragment.newInstance(list);
        }
        else{
            fragment= RecyclerViewFragment.newInstance(list);
        }

        return fragment;

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position==0)
            title="List View";
        else
            title="Recycler View";

        return title;
    }
}

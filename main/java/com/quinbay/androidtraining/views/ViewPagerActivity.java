package com.quinbay.androidtraining.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.quinbay.androidtraining.R;
import com.quinbay.androidtraining.adapters.ViewPagerAdapter;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    ArrayList<CharSequence> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        TabLayout tabLayout=findViewById(R.id.tabLayout);
        for(int i=0;i<10;i++){
            list.add("Item "+i);
        }
        viewPager=findViewById(R.id.list_fragment_container);
        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.list_fragment_container,ListViewFragment.newInstance(list),null)
//                .commit();
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                if(tab.getPosition()==1){
//                    getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.list_fragment_container,RecyclerViewFragment.newInstance(list),null)
//                            .commit();
//                }
//                else if(tab.getPosition()==0){
//                    getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.list_fragment_container,ListViewFragment.newInstance(list),null)
//                            .commit();
//                }
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
    }

}
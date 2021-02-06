package com.quinbay.androidtraining.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.quinbay.androidtraining.R;
import com.quinbay.androidtraining.fragments.DynamicCommFragment;
import com.quinbay.androidtraining.fragments.StaticCommFragment;

public class SecondFragmentCommunicationActivity extends AppCompatActivity implements DynamicCommFragment.IFragmentComm{

    private static final String STATIC_TAG="Static";
    private static final String DYNAMIC_TAG="Dynamic";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_fragment_communication);
        findViewById(R.id.btn_second_comm_frag1).setOnClickListener(view->{
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.second_frag_com,StaticCommFragment.class,null,STATIC_TAG)
                    .addToBackStack(STATIC_TAG)
                    .commit();
        });
        findViewById(R.id.btn_second_comm_frag2).setOnClickListener(view->{
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.second_frag_com, DynamicCommFragment.class,null,DYNAMIC_TAG)
                    .addToBackStack(DYNAMIC_TAG)
                    .commit();
        });

    }

    @Override
    public void textOnChange(String text) {
        StaticCommFragment staticCommFragment=(StaticCommFragment) getSupportFragmentManager().findFragmentByTag(STATIC_TAG);
        staticCommFragment.updateText(text);
    }
}
package com.quinbay.androidtraining.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.quinbay.androidtraining.R;
import com.quinbay.androidtraining.fragments.BSecondCommFragment;

public class ThirdFragmentCommunication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_fragment_communication);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.third_frag_com, BSecondCommFragment.class,null)
                .commit();
    }
}
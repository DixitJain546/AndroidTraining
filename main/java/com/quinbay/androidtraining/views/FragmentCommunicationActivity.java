package com.quinbay.androidtraining.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.quinbay.androidtraining.R;
import com.quinbay.androidtraining.fragments.DynamicCommFragment;
import com.quinbay.androidtraining.fragments.StaticCommFragment;

public class FragmentCommunicationActivity extends AppCompatActivity implements DynamicCommFragment.IFragmentComm {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_communication);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frag_com_dynamic,DynamicCommFragment.class,null)
                .commit();
    }

    @Override
    public void textOnChange(String text) {
        try {
            StaticCommFragment staticCommFragment= (StaticCommFragment) getSupportFragmentManager().findFragmentById(R.id.frag_com_static);
            staticCommFragment.updateText(text);
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
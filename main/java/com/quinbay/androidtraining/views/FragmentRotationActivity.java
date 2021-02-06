package com.quinbay.androidtraining.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.quinbay.androidtraining.R;
import com.quinbay.androidtraining.fragments.RotateFragment;

public class FragmentRotationActivity extends AppCompatActivity {
    RotateFragment rotateFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_rotation);
        if(savedInstanceState==null) {
            rotateFragment=new RotateFragment();
            rotateFragment.setRetainInstance(true);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_rotation_container, rotateFragment, "rotate")
                    .commit();
        }
    }

}
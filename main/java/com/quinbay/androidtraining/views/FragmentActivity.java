package com.quinbay.androidtraining.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.quinbay.androidtraining.R;
import com.quinbay.androidtraining.fragments.ExampleFragment1;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_view, ExampleFragment1.class,null)
               // .addToBackStack(null)
                .commit();
    }
}
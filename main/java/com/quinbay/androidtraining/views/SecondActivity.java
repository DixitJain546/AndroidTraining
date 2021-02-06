package com.quinbay.androidtraining.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.quinbay.androidtraining.R;

public class SecondActivity extends AppCompatActivity {
    private static final String SHOWN_DATA="shown_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.btn_show_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setShownResult();
            }
        });
    }
    void setShownResult(){

        setResult(RESULT_OK);
    }
}
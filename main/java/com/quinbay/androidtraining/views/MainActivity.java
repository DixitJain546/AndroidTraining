package com.quinbay.androidtraining.views;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.quinbay.androidtraining.R;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_next_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode!= Activity.RESULT_OK)
            Toast.makeText(this,  "Not Shown", Toast.LENGTH_SHORT).show();
        if(requestCode==REQUEST_CODE) {
            if(data==null)
                return;
        }
        Toast.makeText(this,  "Shown", Toast.LENGTH_SHORT).show();

    }
}
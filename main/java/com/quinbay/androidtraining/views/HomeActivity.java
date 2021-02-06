package com.quinbay.androidtraining.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.quinbay.androidtraining.R;
import com.quinbay.androidtraining.ThreadActivity;
import com.quinbay.androidtraining.fragments.CustomDialogFragment;
import com.quinbay.androidtraining.fragments.ImplicitFragment;
import com.quinbay.androidtraining.fragments.WebViewFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.btn_second_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_fragment1_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,FragmentActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_fragment2_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,StaticFragmentActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_linear_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,LinearLayoutExample.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_frame_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,FrameLayoutExample.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_constraint_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,ConstraintLayoutExample.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_relative_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,ConstraintLayoutExample.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_view_pager_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, ViewPagerActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_fragment_communication).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, FragmentCommunicationActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_fragment_communication2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, SecondFragmentCommunicationActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_fragment_communication3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, ThirdFragmentCommunication.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_fragment_rotation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, FragmentRotationActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_custom_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               CustomDialogFragment customDialogFragment=new CustomDialogFragment();
               customDialogFragment.setCancelable(false);
               customDialogFragment.show(getSupportFragmentManager(),null);
            }
        });
        findViewById(R.id.btn_nested_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this, NestedFragmentCommunicationActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_wev_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebViewFragment webViewFragment=new WebViewFragment();
                webViewFragment.show(getSupportFragmentManager(),null);
            }
        });
        findViewById(R.id.btn_implicit_intent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImplicitFragment implicitFragment=new ImplicitFragment();
                implicitFragment.show(getSupportFragmentManager(),null);
            }
        });
        findViewById(R.id.btn_handler_looper).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,HandlerActivity.class);
                startActivity(intent);
            }
        });
    }

}
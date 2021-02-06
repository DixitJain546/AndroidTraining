package com.quinbay.androidtraining;

import android.util.Log;

public class ThreadActivity implements Runnable{
    @Override
    public void run() {
        Log.d("Thread",this.getClass().getName());
    }
}

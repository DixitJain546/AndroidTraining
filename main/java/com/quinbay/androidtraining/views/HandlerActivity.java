package com.quinbay.androidtraining.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.TextView;

import com.quinbay.androidtraining.R;

import java.util.Timer;
import java.util.TimerTask;

public class HandlerActivity extends AppCompatActivity {
    TextView textView;
    Handler mHandler;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        textView = findViewById(R.id.tv_handler);
        mHandler = new Handler();
        handlerRun();

    }

    private void handlerRun() {
        new Thread(() -> {
            textView.setText(String.valueOf(Math.random()));
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            handlerRun();
        }).start();

//                        mHandler.postDelayed(new Runnable() {
//
//                            @Override
//                            public void run() {
//                                count++;
//                                if (count < 50) {
//                                    String text = String.valueOf(Math.random());
//                                    textView.setText(text);
//                                    new Thread(new Runnable() {
//                                        @Override
//                                        public void run() {
//
//                                            Log.d("Thread", textView.getText().toString());
//                                        }
//                                    }).start();
//                                    handlerRun();
//                                }
//                            }
//                        },2000);

    }


}
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.Looper;
//import android.os.Message;
//import android.util.Log;
//import android.widget.TextView;
//
//import com.quinbay.androidtraining.R;
//
//import java.util.Random;
//import java.util.Timer;
//import java.util.TimerTask;
//
//public class HandlerActivity extends AppCompatActivity {
//    TextView text;
//    Timer timeout;
//    GenerateTask genTask = new GenerateTask();
//
//    class ExampleRunnable implements Runnable {
//        int number;
//
//        public ExampleRunnable(int number) {
//            this.number = number;
//        }
//
//        @Override
//        public void run() {
//            Log.d("Aalia", "The number is " + number);
//        }
//    }
//
//    class GenerateTask extends TimerTask {
//        @Override
//        public void run() {
//            runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//                    int number = (int) (Math.random() * 100);
//                    text.setText((String.valueOf(number)));
//                    Message msg = Message.obtain(); // msg.what = number;
//                    ExampleRunnable exampleRunnable = new ExampleRunnable(number);
//                    new Thread(exampleRunnable).start();
//                }
//            });
//        }
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_handler);
//        text = findViewById(R.id.tv_handler);
//        timeout = new Timer();
//        timeout.schedule(genTask, 0, 5000);
//        GenerateTask generateTask = new GenerateTask();
//    }
//}

package com.quinbay.androidtraining.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.quinbay.androidtraining.R;


public class RotateFragment extends Fragment {
    TextView textView;
    private static final String TAG="Fragment";
    int mCounter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate()");
        setRetainInstance(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG,"onCreateView()");

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rotate, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG,"onViewCreated()");
//        if(savedInstanceState!=null){
//            mCounter=savedInstanceState.getInt(KEY_COUNTER,0);
//        }
        textView=view.findViewById(R.id.tv_rotate_fragment);
        textView.setText(String.valueOf(mCounter));
        view.findViewById(R.id.btn_rotate_fragment).setOnClickListener(view1->{
            mCounter++;
            textView.setText(String.valueOf(mCounter));
        });
    }

//    @Override
//    public void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putInt(KEY_COUNTER,mCounter);
//    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,"onPause()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"onResume()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG,"onStart()");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG,"onAttach()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG,"onDetach()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG,"onDestroyView()");
    }
}
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

import com.quinbay.androidtraining.R;

public class ExampleFragment1 extends Fragment {
    private static final String TAG="Fragment 1 : ";

    public ExampleFragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG,"onCreateView()");
        View view=inflater.inflate(R.layout.fragment_example1, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.frag1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container_view,ExampleFragment2.class,null)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

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
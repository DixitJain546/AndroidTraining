package com.quinbay.androidtraining.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.quinbay.androidtraining.R;

public class ASecondCommFragment extends Fragment {
    private String mParam1;
    private static final String ARG_PARAM1 = "param1";

    public static ASecondCommFragment newInstance(String text){
        ASecondCommFragment aSecondCommFragment = new ASecondCommFragment();
        Bundle bundle=new Bundle();
        bundle.putString(ARG_PARAM1,text);
        aSecondCommFragment.setArguments(bundle);
        return aSecondCommFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null)
        {
            mParam1=getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a_second_comm, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView=view.findViewById(R.id.tv_a_comm);
        textView.setText(mParam1);
    }
}
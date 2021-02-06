package com.quinbay.androidtraining.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.quinbay.androidtraining.R;

public class BSecondCommFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b_second_comm, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText editText=view.findViewById(R.id.et_b_comm);
        view.findViewById(R.id.btn_b_comm).setOnClickListener(view1-> {
            getActivity().getSupportFragmentManager().beginTransaction()
            .replace(R.id.third_frag_com,ASecondCommFragment.newInstance(editText.getText().toString()),null)
            .commit();
        });
    }
}
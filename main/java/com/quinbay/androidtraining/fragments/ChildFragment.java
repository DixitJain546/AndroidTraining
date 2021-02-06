package com.quinbay.androidtraining.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.quinbay.androidtraining.R;

public class ChildFragment extends Fragment {
    IChildFragmentText iChildFragmentText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
      //  iChildFragmentText= (IChildFragmentText) context;
      iChildFragmentText= (IChildFragmentText) getParentFragment();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_child, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText editText=view.findViewById(R.id.et_child_frag);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                iChildFragmentText.textOnChange(editText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public interface IChildFragmentText{
        void textOnChange(String text);
    }
}
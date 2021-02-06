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

public class DynamicCommFragment extends Fragment {
    IFragmentComm iFragmentComm;
    private static final String ARG_PARAM1 = "param1";
    private String mParam1;

    public DynamicCommFragment() {
        // Required empty public constructor
    }

    public static DynamicCommFragment newInstance(String param1) {
        DynamicCommFragment fragment = new DynamicCommFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            iFragmentComm= (IFragmentComm) context;
        }catch (ClassCastException e){
            e.printStackTrace();
        }

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dynamic_comm, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText editText=view.findViewById(R.id.et_dynamic_frag);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                getActivity().getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.frag_com_static,StaticCommFragment.newInstance(editText.getText().toString()),null)
//                        .commit();
                iFragmentComm.textOnChange(editText.getText().toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public interface IFragmentComm{
        void textOnChange(String text);
    }
}
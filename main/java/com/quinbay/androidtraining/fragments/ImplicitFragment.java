package com.quinbay.androidtraining.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.quinbay.androidtraining.R;

public class ImplicitFragment extends DialogFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_implicit, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_send_implicit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText=getView().findViewById(R.id.et_implicit_fragment);
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"+editText.getText().toString()));
                getContext().startActivity(Intent.createChooser(intent,"Sending Email...."));
               startActivity(intent);
            }
        });
    }
}
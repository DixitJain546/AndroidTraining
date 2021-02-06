package com.quinbay.androidtraining.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.quinbay.androidtraining.R;

import java.util.ArrayList;

public class ListViewFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";

    private ArrayList<CharSequence> mParam1;


    public static ListViewFragment newInstance(ArrayList<CharSequence> list) {
        ListViewFragment fragment = new ListViewFragment();
        Bundle args = new Bundle();
        args.putCharSequenceArrayList(ARG_PARAM1, list);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getCharSequenceArrayList(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayAdapter adapter = new ArrayAdapter<CharSequence>(getContext(),R.layout.row_list_text, mParam1);
        ListView listView=view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
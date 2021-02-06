package com.quinbay.androidtraining.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.quinbay.androidtraining.R;

import java.util.ArrayList;

public class RecycleFragmentAdapter extends RecyclerView.Adapter<RecycleFragmentAdapter.RecycleFragmentViewHolder> {
    ArrayList<CharSequence> list;


    public RecycleFragmentAdapter(ArrayList<CharSequence> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecycleFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_item, parent, false);

        return new RecycleFragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleFragmentViewHolder holder, int position) {
        CharSequence text=list.get(position);
        holder.tv_Name.setText(text.toString());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecycleFragmentViewHolder extends RecyclerView.ViewHolder{
        TextView tv_Name;
        public RecycleFragmentViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_Name=itemView.findViewById(R.id.tv_list_view);
        }
    }

}

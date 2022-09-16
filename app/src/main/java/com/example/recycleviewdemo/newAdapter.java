package com.example.recycleviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class newAdapter extends RecyclerView.Adapter<myNewViewHolder> {
ArrayList<Model1> data;
    public newAdapter(ArrayList<Model1> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myNewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.test,parent,false);
        return new myNewViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myNewViewHolder holder, int position) {
holder.t1.setText(data.get(position).getHeader());

    }

    @Override
    public int getItemCount() { return data.size();
    }

}

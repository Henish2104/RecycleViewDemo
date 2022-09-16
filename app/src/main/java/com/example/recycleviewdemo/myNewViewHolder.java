package com.example.recycleviewdemo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;



public class myNewViewHolder extends RecyclerView.ViewHolder {
    TextView t1;

    public myNewViewHolder(@NonNull View itemView) {
        super(itemView);
        t1=(TextView)itemView.findViewById(R.id.t1);
    }
}

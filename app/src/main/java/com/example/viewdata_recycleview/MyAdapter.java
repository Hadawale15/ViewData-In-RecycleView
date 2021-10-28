package com.example.viewdata_recycleview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.core.Context;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


    List<Model> list;

    public MyAdapter(List<Model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.newlayout,null,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model=list.get(position);
        holder.t1.setText(model.getName());
        holder.t2.setText(model.getEmail());
        holder.t3.setText(model.getDob());
        holder.t4.setText(model.getPassword());
        holder.t5.setText(model.getId());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

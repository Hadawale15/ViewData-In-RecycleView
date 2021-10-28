package com.example.viewdata_recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView t1,t2,t3,t4,t5;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        t1=itemView.findViewById(R.id.name_id);
        t2=itemView.findViewById(R.id.email_id);
        t3=itemView.findViewById(R.id.dob_id);
        t4=itemView.findViewById(R.id.password_id);
        t5=itemView.findViewById(R.id.Id_id);
    }
}

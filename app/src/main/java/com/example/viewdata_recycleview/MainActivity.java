package com.example.viewdata_recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button button;
    RecyclerView recyclerView;
    DatabaseReference databaseReference;
    List<Model> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button_id);
        recyclerView=findViewById(R.id.RecycleView_id);
        list=new ArrayList<>();

        databaseReference= FirebaseDatabase.getInstance().getReference("User");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        list.clear();

                        for (DataSnapshot dataSnapshot:snapshot.getChildren()){
                            Model model=dataSnapshot.getValue(Model.class);
                            list.add(model);
                        }

                               MyAdapter myAdapter=new MyAdapter(list);
                               recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                               recyclerView.setAdapter(myAdapter);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }
}
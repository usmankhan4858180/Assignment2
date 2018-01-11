package com.example.assignment2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RecyclerView1;
    private RecyclerView.Adapter adapter;
    private List<ContactClass> contactClasses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView1 = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView1.setHasFixedSize(true);
        RecyclerView1.setLayoutManager(new LinearLayoutManager(this));

        contactClasses = new ArrayList<>();
        for (int i=0; i<10; i++){
            ContactClass contactClass = new ContactClass(
                    "Name" + (i+1),
                    "phone" + (i+1),
                    "image"
            );

            contactClasses.add(contactClass);
        }

        adapter = new MyAdapter(contactClasses,this);
        RecyclerView1.setAdapter(adapter);
    }
}

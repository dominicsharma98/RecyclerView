package com.example.root.lasttry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0;i<10;i++) {
            if (i % 2 == 0) {
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.programmingList);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                String[] names = {"Akash", "Sagar", "Karan", "Vaibhav", "Akash", "Sagar", "Karan", "Vaibhav", "Akash", "Sagar", "Karan", "Vaibhav"};
                recyclerView.setAdapter(new ProgrammingAdapter(names));
            }
        }




    }
}

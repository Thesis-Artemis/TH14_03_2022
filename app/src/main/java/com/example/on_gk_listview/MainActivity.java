package com.example.on_gk_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listDonut;
    DonutAdapter adt;
    ArrayList<SpDonut> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listDonut= findViewById(R.id.list_donut);

        arrayList = new ArrayList<>();
        arrayList.add(new SpDonut("Tasty Donut",
                "Spicy tasty donut family","$10.00",
                R.drawable.donut_yellow));
        arrayList.add(new SpDonut("Pink Donut",
                "Spicy tasty donut family","$20.00",
                R.drawable.tasty_donut));
        arrayList.add(new SpDonut("Floating Donut",
                "Spicy tasty donut family","$30.00",
                R.drawable.green_donut));
        arrayList.add(new SpDonut("Floating Donut",
                "Spicy tasty donut family","$30.00",
                R.drawable.donut_red));

        adt = new DonutAdapter(this, R.layout.activity_listview, arrayList);
        Button btnDonut= (Button) findViewById(R.id.button);
        listDonut.setAdapter(adt);
        btnDonut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                doOpenChildActivity();
            }
        });
    }
    public void doOpenChildActivity()
    {
        Intent myIntent=new Intent(this, IntentAcivity.class);
        startActivity(myIntent);
    }



}
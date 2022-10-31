package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
         listView = (ListView)  findViewById(R.id.list_view);

         //make an array list
        ArrayList<String> arrayList = new ArrayList<>();

        //add items to arrayList
        arrayList.add("pop");
        arrayList.add("hiphop");
        arrayList.add("R&B");
        arrayList.add("Indie");
        arrayList.add("Rock");
        arrayList.add("classical");

        //initialize the adapter
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        //connect adapter to array
        listView.setAdapter(arrayAdapter);
    }
}
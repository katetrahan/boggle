package com.example.guest.boggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    GridView gridView;


    String[] letters = new String[]{
            "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Z"


    };
//    String [] vowels = new String[] {
//            "A", "E", "I", "O", "U", "Y"
//    };

//    for(int i = 0; i < letters.length; i++) list.add(i);
//    Collections.shuffle(list);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.baseGridView);
//        List<String> list = new ArrayList<String>();


        for(int i = 0;i<letters.length;i++)list.add(letters[i]);
        Collections.shuffle(list);

        gridView.setAdapter(new BoggleAdapter(this, letters, list));






    }





}

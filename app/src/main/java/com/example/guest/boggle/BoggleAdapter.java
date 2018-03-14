package com.example.guest.boggle;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class BoggleAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mLetters;
    private ArrayList<String> mList;
//    private String[] mVowels;

    public BoggleAdapter(Context context, String[] letters, ArrayList<String> list) {
        this.mContext = context;
        this.mLetters = letters;
        this.mList = list;
//        this.mVowels = vowels;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public Object getItem(int position){
        return null;
    }

    @Override
    public long getItemId(int i){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            //get layout from xml file
            gridView = inflater.inflate(R.layout.boogle, null);


            //pull views
            TextView letterView = (TextView) gridView
                    .findViewById(R.id.boggle_letter);

            //set values into views

            letterView.setText(ArrayList<String>mList);
//            letterView.setText(mVowels[position]);

        } else {
            gridView = (View) convertView;

        }

        return gridView;

    }

}

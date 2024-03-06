package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    ArrayList<CatModel> data = new ArrayList<>();
    int[] catImages = {R.drawable.cat1,
            R.drawable.cat2,
            R.drawable.cat3,
            R.drawable.cat4,
            R.drawable.cat5,
            R.drawable.cat6,
            R.drawable.cat7,
            R.drawable.cat8,
            R.drawable.cat9,
            R.drawable.cat10,
            R.drawable.cat11,
            R.drawable.cat12,
            R.drawable.cat13};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecyclerView=findViewById(R.id.recyclerview);
        String [] catFacts = {getText(R.string.fact_1).toString(), getText(R.string.fact_2).toString(),
                getText(R.string.fact_3).toString(), getText(R.string.fact_4).toString(),
                getText(R.string.fact_5).toString(), getText(R.string.fact_6).toString(),
                getText(R.string.fact_7).toString(),getText(R.string.fact_8).toString(),
                getText(R.string.fact_9).toString(),getText(R.string.fact_10).toString(),
                getText(R.string.fact_11).toString(),getText(R.string.fact_12).toString(),
                getText(R.string.fact_13).toString()};
        for(int i=0; i<catImages.length; i++) {
            data.add(new CatModel(catImages[i], catFacts[i]));
        }

        AdapterClass adapter = new AdapterClass(data);
        mrecyclerView.setAdapter(adapter);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }
}
package com.example.todolistcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv;
        ArrayList<AndroidVersion> OSList;
        ArrayAdapter<AndroidVersion> aaOS;


            lv = findViewById(R.id.lv);
        OSList = new ArrayList<>();
        OSList.add(new AndroidVersion("MSA","1/7/2019"));
        OSList.add(new AndroidVersion("Go for haircut","22/9/2019"));
        aaOS = new CustomAdapter(this, R.layout.row,OSList);

        lv.setAdapter(aaOS);
        }
}

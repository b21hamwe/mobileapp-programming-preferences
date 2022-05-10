package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ReadActivity extends AppCompatActivity {


    TextView textviewname;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    @Override
    protected void onResume() {
        super.onResume();


        String name = preferences.getString("name","inget namn hittades");
        textviewname.setText(name);
    }
}
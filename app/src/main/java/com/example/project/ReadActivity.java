package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReadActivity extends AppCompatActivity {


    TextView textviewname;
    SharedPreferences preferences;
    Button open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewname = findViewById(R.id.viewpage2);
        preferences = getSharedPreferences("preferences", MODE_PRIVATE);
        open = findViewById(R.id.open);

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReadActivity.this, WriteActivity.class));
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();


        String name = preferences.getString("name","inget namn hittades");
        textviewname.setText(name);
    }
}
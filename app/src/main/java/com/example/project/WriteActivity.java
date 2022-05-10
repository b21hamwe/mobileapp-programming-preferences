package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class WriteActivity extends AppCompatActivity {




    TextView textviewname;
    SharedPreferences preferences;
    Button close;
    Button save;
    EditText text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textviewname = findViewById(R.id.spara);
        close = findViewById(R.id.CLOSE);
        save = findViewById(R.id. spara);
        text = findViewById(R.id.edit_text);
        preferences = getSharedPreferences("preferences", MODE_PRIVATE);



        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = text.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("name",input);
                editor.apply();
            }
        });






    }



}

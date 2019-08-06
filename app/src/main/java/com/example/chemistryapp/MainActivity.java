package com.example.chemistryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Developer: Vedant Shah
    //I wanted to create this application to help students with the Grade 12 Chemistry Ontario curriculum material so they can do well in the course and succeed.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.title);
        TextView textView2 = findViewById(R.id.welcomeMessage);
        ImageView image = findViewById(R.id.scienceImage);
        image.setImageResource(R.drawable.science);

        Button btn_getStarted;
        btn_getStarted = (Button)findViewById(R.id.button_getStarted);
        btn_getStarted.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openUnitsList();
            }
        });
    }

    public void openUnitsList(){
        Intent intent = new Intent(this, UnitsList.class);
        startActivity(intent);
    }
}

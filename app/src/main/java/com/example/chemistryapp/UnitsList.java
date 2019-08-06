package com.example.chemistryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UnitsList extends AppCompatActivity {

    Button unit1, unit2, unit3, unit4, unit5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units_list);

        TextView textView = findViewById(R.id.title);
        TextView u1 = findViewById(R.id.unit1);
        TextView u2 = findViewById(R.id.unit2);
        TextView u3 = findViewById(R.id.unit3);
        TextView u4 = findViewById(R.id.unit4);
        TextView u5 = findViewById(R.id.unit5);

        unit1 = (Button) findViewById(R.id.unit1);
        unit1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openUnit1();
            }
        });
        unit2 = (Button) findViewById(R.id.unit2);
        unit2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openUnit2();
            }
        });
        unit3 = (Button) findViewById(R.id.unit3);
        unit3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openUnit3();
            }
        });
        unit4 = (Button) findViewById(R.id.unit4);
        unit4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openUnit4();
            }
        });
        unit5 = (Button) findViewById(R.id.unit5);
        unit5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openUnit5();
            }
        });
    }

    public void openUnit1(){
        Intent intent = new Intent(this, Unit1.class);
        startActivity(intent);
    }

    public void openUnit2(){
        Intent intent = new Intent(this, Unit2.class);
        startActivity(intent);
    }

    public void openUnit3(){
        Intent intent = new Intent(this, Unit3.class);
        startActivity(intent);
    }

    public void openUnit4(){
        Intent intent = new Intent(this, Unit4.class);
        startActivity(intent);
    }

    public void openUnit5(){
        Intent intent = new Intent(this, Unit5.class);
        startActivity(intent);
    }
}

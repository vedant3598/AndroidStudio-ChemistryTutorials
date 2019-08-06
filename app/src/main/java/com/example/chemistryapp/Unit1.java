package com.example.chemistryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Unit1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1);

        TextView textView = findViewById(R.id.title);
        Button lesson1 = (Button) findViewById(R.id.lesson1);
        Button lesson2 = (Button) findViewById(R.id.lesson2);
        Button lesson3 = (Button) findViewById(R.id.lesson3);
        Button lesson4 = (Button) findViewById(R.id.lesson4);
        Button lesson5 = (Button) findViewById(R.id.lesson5);
        Button lesson6 = (Button) findViewById(R.id.lesson6);
        Button lesson7 = (Button) findViewById(R.id.lesson7);
        Button lesson8 = (Button) findViewById(R.id.lesson8);
        Button lesson9 = (Button) findViewById(R.id.lesson9);
        Button lesson10 = (Button) findViewById(R.id.lesson10);
        Button lesson11 = (Button) findViewById(R.id.lesson11);
    }

    public void viewLesson1(View view){
        CopyReadAssets("Tang 01 - LIGHT AND ATOMIC STRUCTURE.pdf");
    }

    public void viewLesson2(View view){
        CopyReadAssets("Tang 02 - WAVE QUANTUM MECHANIC MODEL.pdf");
    }

    public void viewLesson3(View view){
        CopyReadAssets("Tang 03 - QUANTUM NUMBERS.pdf");
    }

    public void viewLesson4(View view){
        CopyReadAssets("Tang 04 - PERIODIC TRENDS.pdf");
    }

    public void viewLesson5(View view){
        CopyReadAssets("Tang 05 - LEWIS DOT DIAGRAMS.pdf");
    }

    public void viewLesson6(View view){
        CopyReadAssets("Tang 05b - FORMAL CHARGE & LEWIS DOT DIAGRAMS.pdf");
    }

    public void viewLesson7(View view){
        CopyReadAssets("Tang 06 - VALENCE BOND THEORY AND HYBRIDIZATION.pdf");
    }

    public void viewLesson8(View view){
        CopyReadAssets("Tang 07 - VSEPR.pdf");
    }

    public void viewLesson9(View view){
        CopyReadAssets("Tang 08 - POLARITY.pdf");
    }

    public void viewLesson10(View view){
        CopyReadAssets("Tang 09 - INTERMOLECULAR FORCES AND SOLUBILITY.pdf");
    }

    public void viewLesson11(View view){
        CopyReadAssets("Tang 10 - STRUCTURE AND PROPERTIES OF SOLIDS.pdf");
    }


    private void CopyReadAssets(String name)
    {
        AssetManager assetManager = getAssets();

        InputStream in = null;
        OutputStream out = null;
        File file = new File(getFilesDir(), name);
        try
        {
            in = assetManager.open(name);
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e)
        {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/" + name),
                "application/pdf");

        startActivity(intent);
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }

}

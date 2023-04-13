package com.example.apkimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void im1 (View view){
        Toast.makeText(this, " es un poni", Toast.LENGTH_SHORT).show();
    }
    public void im2(View view){
        Toast.makeText(this, " es un gato", Toast.LENGTH_SHORT).show();
    }
    public void im3(View view){
        Toast.makeText(this, " es un perro", Toast.LENGTH_SHORT).show();
    }
    public void im4(View view){
        Toast.makeText(this, " es un pato", Toast.LENGTH_SHORT).show();
    }
}
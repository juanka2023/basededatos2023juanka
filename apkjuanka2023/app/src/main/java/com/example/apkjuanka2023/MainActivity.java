package com.example.apkjuanka2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculadora(View view){
        Intent i = new Intent(this, calculadora.class);
        startActivity(i);
    }
    public void formulario(View view){
        Intent i = new Intent(this,formularioactivity.class);
        startActivity(i);
    }

}
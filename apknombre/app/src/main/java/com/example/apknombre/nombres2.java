package com.example.apknombre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class nombres2 extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombres2);

        tv1 = (TextView)  findViewById(R.id.tv1);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("hola " +dato);
    }

    //metodo para el boton volver
    public void volver (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
package com.example.apkjuanka2023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

    private EditText tn1 ,tn2;
    private TextView tr1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        tn1 = (EditText) findViewById(R.id.tn1);
        tn2 = (EditText) findViewById(R.id.tn2);
        tr1 = (TextView) findViewById(R.id.tv_resultado);

    }
    public void suma(View view) {
        String valor1_String = tn1.getText().toString();
        String valor2_String = tn2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        int operacion = valor1_int + valor2_int;
        String resultado = String.valueOf(operacion);
        tr1.setText(resultado);
    }
       public void calculadora(View view){
        finish();
      }

    }
package com.example.resumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class CalculadoraActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);

    }

    // Método Sumar
    public void sumar(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        int operacion = valor1_int + valor2_int;
        String resultado = String.valueOf(operacion);
        tv_resultado.setText(resultado);
    }

    // Método Restar
    public void restar(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        int operacion = valor1_int - valor2_int;
        String resultado = String.valueOf(operacion);
        tv_resultado.setText(resultado);
    }

    // Método multiplicar
    public void multiplicar(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        int operacion = valor1_int * valor2_int;
        String resultado = String.valueOf(operacion);
        tv_resultado.setText(resultado);
    }

    // Método Dividir
    public void dividir(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        if(valor2_int != 0){
            int operacion = valor1_int / valor2_int;
            String resultado = String.valueOf(operacion);
            tv_resultado.setText(resultado);
        } else {
            Toast.makeText(this, "No se puede dividir entre cero..", Toast.LENGTH_LONG).show();
        }


    }

    public void volver(View view){
        finish();
    }
}
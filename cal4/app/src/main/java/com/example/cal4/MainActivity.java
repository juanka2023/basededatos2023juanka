package com.example.cal4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox ck1, ck2, ck3, ck4;
    private TextView tv_resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtn1);
        et2 = (EditText) findViewById(R.id.txtn2);
        ck1 = (CheckBox) findViewById(R.id.ck2);
        ck2 = (CheckBox) findViewById(R.id.ck1);
        ck3 = (CheckBox) findViewById(R.id.ck3);
        ck4 = (CheckBox) findViewById(R.id.ck4);
        tv_resultado = (TextView) findViewById(R.id.txtresultado);
    }
    public void calcular(View view) {
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();
        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor1_String);

        String resultado = "";

        if (ck3.isChecked() == true) {
            int suma = valor1_int + valor2_int;
            resultado = " la suma es: " + suma + "/";
            tv_resultado.setText(resultado);
        }
        if (ck4.isChecked() == true) {
            int resta = valor1_int - valor2_int;
            resultado = " la resta es: " + resta + "/";
            tv_resultado.setText(resultado);
        }

        if(ck1.isChecked() == true){
            int mult = valor1_int * valor2_int;
            resultado = " la multiplicacion es: " + mult + "/";
            tv_resultado.setText(resultado);
        }
        if(ck2.isChecked() == true){
            int divi = valor1_int / valor2_int;
            resultado = resultado + " la division es: " + divi;
            tv_resultado.setText(resultado);
            } else {
            Toast.makeText(this, "El segundo valor debe ser diferente a cero", Toast.LENGTH_SHORT).show();
        }
    }
}
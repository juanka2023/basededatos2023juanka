package com.example.ejem5android;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 =(EditText) findViewById(R.id.valor1);
        et2 =(EditText) findViewById(R.id.valor2);
        tv1 =(TextView) findViewById(R.id.resultado);
        sp1 =(Spinner) findViewById(R.id.spinner);

        String [] opciones = {"suma", "restar", "multiplicar", "dividir"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones);
        sp1.setAdapter(adapter);
    }

    public void calcular (View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        String seleccion = sp1.getSelectedItem().toString();

        if (seleccion.equals("suma")){
            int operacion = valor1_int + valor2_int;
            String resultado = String.valueOf(operacion);
            tv1.setText(resultado);
        }
        if (seleccion.equals("resta")){
            int operacion = valor1_int - valor2_int;
            String resultado = String.valueOf(operacion);
            tv1.setText(resultado);
        }
        if (seleccion.equals("multiplicar")){
            int operacion = valor1_int * valor2_int;
            String resultado = String.valueOf(operacion);
            tv1.setText(resultado);
        }
        if (seleccion.equals("dividir")) {
            int operacion = valor1_int / valor2_int;
            String resultado = String.valueOf(operacion);
            tv1.setText(resultado);
        } else {
            Toast.makeText(this, "El segundo valor debe ser diferente a cero", Toast.LENGTH_SHORT).show();

     }
  }
}
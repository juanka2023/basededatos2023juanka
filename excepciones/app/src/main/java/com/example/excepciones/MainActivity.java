package com.example.excepciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tvtresul);

    }
    public void  dividir(View view){
        try {
            //codigo
            public void dividir (View view){
                String valor1_String = et1.getText().toString();
                String valor2_String = et2.getText().toString();

                int valor1_int = Integer.parseInt(valor1_String);
                int valor2_int = Integer.parseInt(valor2_String);

                int dividir =  valor1_int / valor2_int){
                String  resultado =String.valueOf(dividir);

                tv1.setText(resultado);

        } catch (exception e){
             //comportamiento del error
                    String error = "error!!!!!" + e;
        }finally {
            Toast.makeText(this, "se han concluido la operacion", Toast.LENGTH_SHORT).show();




    }


}


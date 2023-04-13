package com.example.myapplicationnotamedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtnumero1);
        et2 = (EditText) findViewById(R.id.txtnumero2);
        et3 = (EditText) findViewById(R.id.txtnumero3);
        tv1 = (TextView) findViewById(R.id.txtresultado);
    }
    //Este metodo realiza la media de 3 notas de asignaturas e indica si has aprobado o suspendido

    public void media(View view){
        String mates = et1.getText().toString();
        String quimica = et1.getText().toString();
        String lengua = et1.getText().toString();

        int nMates = Integer.parseInt(mates);
        int nQuimica = Integer.parseInt(quimica);
        int nLengua = Integer.parseInt(lengua);

        int media = (nMates + nQuimica + nLengua) / 3;
        String  resultado = "";

        if(media >= 5){
            resultado = "tu nota es " + media + "Has Aprovado";

        } else {
            resultado = "tu nota es " + media + "Has Suspendido";
        }

        tv1.setText(resultado);

    }
}
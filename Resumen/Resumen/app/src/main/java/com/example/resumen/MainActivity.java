package com.example.resumen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner sp1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = (Spinner) findViewById(R.id.sp1);
        tv1 = (TextView) findViewById(R.id.tv1);

        String [] paises = {"Selecciona un pais...", "España", "Francia", "Italia"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_egakipedia, paises);
        sp1.setAdapter(adapter);

        String texto = getIntent().getStringExtra("texto");
        tv1.setText(texto);
    }

    //Método ir a Web
    public void Navegar(View view){
        Intent i = new Intent(this, WebActivity.class);

        String valor = sp1.getSelectedItem().toString();

        if(valor.equals("España")){
            String URL = "https://es.wikipedia.org/wiki/Espa%C3%B1a";
            i.putExtra("sitioWeb", URL);
            startActivity(i);
        }
        if(valor.equals("Francia")){
            String URL = "https://es.wikipedia.org/wiki/Francia ";
            i.putExtra("sitioWeb", URL);
            startActivity(i);
        }
        if(valor.equals("Italia")){
            String URL = "https://es.wikipedia.org/wiki/Italia";
            i.putExtra("sitioWeb", URL);
            startActivity(i);
        }
        if(valor.equals("Selecciona un pais...")){
            Toast.makeText(this, "Debes elegir un pais...", Toast.LENGTH_LONG).show();
        }

    }

    //Método ir a Calculadora
    public void calculadora(View view){
        Intent i = new Intent(this, CalculadoraActivity.class);
        startActivity(i);
    }

    //Método ir a Formulario
    public void formulario(View view){
        Intent i = new Intent(this, FormularioActivity.class);
        startActivity(i);
    }

}
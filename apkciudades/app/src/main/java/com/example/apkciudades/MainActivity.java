package com.example.apkciudades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner sp1 ,sp2;
    private TextView tex1 ,tex2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = (Spinner) findViewById(R.id.sp1);
        tex1 = (TextView) findViewById(R.id.nota1);
        sp2 = (Spinner) findViewById(R.id.sp2);
        tex2 =(TextView)  findViewById(R.id.texnota2);

        String [] opciones = {"Toledo", "Ciudad real", "guadalajada", "Cuenca" ,"Albacete"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones);
        sp1.setAdapter(adapter);

        String [] opciones1 = {"Talavera de la Reina", "Daimiel", ">Siguenza", "San Clemente" ,"hellin"};
        ArrayAdapter <String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones1);
        sp1.setAdapter(adapter);
    }
    public void ponernombres (View view){
        String Sp1_String = sp1.toString();
        String sp2_String = sp2.toString();

        String seleccion = sp1.getSelectedItem().toString();
        if (seleccion.equals("Toledo")){
            tex2.setText("Talavera de la Reina");
        }
        if (seleccion.equals("Ciudad Real")){
            tex2.setText("Daimiel");
        }
        if (seleccion.equals("guadalajada")){
            tex2.setText("Siguenza");
        }
        if (seleccion.equals("Cuenca")) {
            tex2.setText("San Clemente");
        }
        if (seleccion.equals("Albacete")) {
            tex2.setText("hellin");
        }

        String seleccion1 = sp2.getSelectedItem().toString();

        if (seleccion.equals("Talavera de la Reina")){
            tex1.setText("Toledo");
        }
        if (seleccion.equals("Daimiel")){
            tex1.setText("Ciudad Real");
        }
        if (seleccion.equals("Siguenza")){
            tex1.setText("Siguenza");
        }
        if (seleccion.equals("San Clemente")) {
            tex1.setText("Cuenca");
        }
        if (seleccion.equals("hellin")){
            tex1.setText("Albacete");
        } else {
            Toast.makeText(this, "la respuesta no es correcta", Toast.LENGTH_SHORT).show();
        }
    }
}
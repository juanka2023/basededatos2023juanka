package com.example.appimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre, et_pas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombre = (findViewById(R.id.txtn));
        et_pas = (findViewById(R.id.edp));
    }

    public void reguistrar(View view) {
        String nombre = et_nombre.getText().toString();
        String pas = et_pas.getText().toString();

        if (nombre.length() == 0) {
            Toast.makeText(this, "debe ingresar un nombre", Toast.LENGTH_SHORT).show();
        }
        if (pas.length() == 0) {
            Toast.makeText(this, "debes ingresar una contraseña", Toast.LENGTH_SHORT).show();
        }
        if (nombre.length() != 0 && pas.length() != 0) ;
        Toast.makeText(this, "te has registrado", Toast.LENGTH_SHORT).show();
        }
   }

}
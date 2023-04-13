package com.example.resumen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    private EditText et_nombre, et_apellidos, et_direccion, et_telefono, et_email, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        et_nombre = (EditText) findViewById(R.id.et_nombre);
        et_apellidos = (EditText) findViewById(R.id.et_apellidos);
        et_direccion = (EditText) findViewById(R.id.et_direccion);
        et_telefono = (EditText) findViewById(R.id.et_telefono);
        et_email = (EditText) findViewById(R.id.et_email);
        et_password = (EditText) findViewById(R.id.et_password);
    }

    // Método Validar Formulario
    public void validar(View view){
        String nombre_String = et_nombre.getText().toString();
        String apellidos_String = et_apellidos.getText().toString();
        String direccion_String = et_direccion.getText().toString();
        String telefono_String = et_telefono.getText().toString();
        String email_String = et_email.getText().toString();
        String password_String = et_password.getText().toString();

        int test = 0;

        if(nombre_String.isEmpty()){
            Toast.makeText(this, "Debes introducir un Nombre", Toast.LENGTH_LONG).show();
            test = 1;
        }
        if(apellidos_String.isEmpty()){
            Toast.makeText(this, "Debes introducir unos Apellidos", Toast.LENGTH_LONG).show();
            test = 1;
        }
        if(direccion_String.isEmpty()){
            Toast.makeText(this, "Debes introducir una Dirección", Toast.LENGTH_LONG).show();
            test = 1;
        }
        if(telefono_String.isEmpty()){
            Toast.makeText(this, "Debes introducir un Teléfono", Toast.LENGTH_LONG).show();
            test = 1;
        }
        if(email_String.isEmpty()){
            Toast.makeText(this, "Debes introducir un email", Toast.LENGTH_LONG).show();
            test = 1;
        }
        if(password_String.isEmpty()){
            Toast.makeText(this, "Debes introducir una Contraseña", Toast.LENGTH_LONG).show();
            test = 1;
        }

        if(test == 0){
            Toast.makeText(this, "El formulario se ha grabado correctamente...", Toast.LENGTH_LONG).show();

            String texto = nombre_String + " " + apellidos_String;
            Intent i = new Intent(this, MainActivity.class);
            i.putExtra("texto", texto);
            startActivity(i);
            finish();

        }
    }


}
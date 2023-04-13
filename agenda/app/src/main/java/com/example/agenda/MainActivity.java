package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tv1, tv2;
    private EditText et3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        et3 = (EditText) findViewById(R.id.et3);

        SharedPreferences preferencia = getSharedPreferences("nombreapellido", Context.MODE_PRIVATE);
        tv1.setText(preferencia.getString("nombreapellido", ""));

        SharedPreferences preferencia1 = getSharedPreferences("direcccion", Context.MODE_PRIVATE);
        tv2.setText(preferencia.getString("direccion", ""));

        SharedPreferences preferencia2 = getSharedPreferences("telefono", Context.MODE_PRIVATE);
        tv1.setText(preferencia.getString("telefono", ""));
    }

    public void guardar(View view) {
        SharedPreferences preferencia = getSharedPreferences("nombreapellido", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferencia.edit();
        obj_editor.putString("nombreapellido", tv1.getText().toString());
        obj_editor.commit();
        finish();
    }

}
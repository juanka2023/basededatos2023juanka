package com.example.myapplicationcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;



    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtnumero1);
        et2 = (EditText) findViewById(R.id.txtnumero2);
        tv1 = (TextView) findViewById(R.id.txtresultado);
    }
    //realiza los calculos de de dos numero de suma resta multiplicacion y division

    public void total(View view){
        String txtnumero1 = et1.toString().getText().toSrign();

    }
}
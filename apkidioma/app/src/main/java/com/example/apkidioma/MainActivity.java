package com.example.apkidioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private Spinner sp1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.tv1);
        sp1 = (Spinner) findViewById(R.id.sp1);

        String [] paises ={"España","Francia","Alemania","Italia"};
        String idiomas  [] ={"Español","Francia","Aleman","Italiano"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.idiomas1, paises);
        sp1.setAdapter(adapter);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("en " +sp1.getItemAtPosition(i) + " se habla "+ idiomas [i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
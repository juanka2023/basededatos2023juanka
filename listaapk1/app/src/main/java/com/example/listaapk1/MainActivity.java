package com.example.listaapk1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombre [] = {"Carmen","juan","Carlos","raquel","maria","lucas"};
    private String edad [] = {"10","15","50","77","30","5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv);
        lv1 = (ListView) findViewById(R.id.lv);

        ArrayAdapter<String>adapter =new ArrayAdapter<String>(this,R.layout.nuevolistado,nombre);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("la edad es " + lv1.getItemAtPosition(i) + " es " + edad[i] + " años.");
            }
        });
  }
}
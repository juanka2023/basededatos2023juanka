package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class segundoactiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundoactiviy);
    }
    //medodo del boton anterior
    public void anterior(View view){
        Intent anterior =new Intent(this,MainActivity.class);
        startActivity(anterior);
    }
}
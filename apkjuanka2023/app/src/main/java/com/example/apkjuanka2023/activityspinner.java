package com.example.apkjuanka2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class activityspinner extends AppCompatActivity {

    private Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityspinner);

        sp1 = (Spinner) findViewById(R.id.sp1);


    }
}
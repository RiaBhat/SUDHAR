package com.example.android.sudhar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Pop extends AppCompatActivity {
    int r;
    EditText show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);
        r=(int)(900000*Math.random())+1;
        show=(EditText) findViewById(R.id.a2);
        show.setText(""+r);
    }
}

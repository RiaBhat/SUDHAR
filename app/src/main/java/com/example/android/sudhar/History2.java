package com.example.android.sudhar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class History2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history2);
        Intent i=getIntent();
        Toast.makeText(History2.this,i.getStringExtra("num"),Toast.LENGTH_SHORT).show();

    }
}


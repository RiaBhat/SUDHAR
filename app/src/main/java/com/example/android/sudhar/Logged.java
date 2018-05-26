package com.example.android.sudhar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Logged extends AppCompatActivity {
    Button logout , history , newComplaint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);

        logout=(Button)findViewById(R.id.a1);
        history=(Button)findViewById(R.id.a2);
        newComplaint=(Button)findViewById(R.id.a3);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Logged.this,Login.class);
                startActivity(i);
            }
        });
        newComplaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Logged.this,NewComplaint.class);
                startActivity(i);
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Logged.this,History1.class);
                startActivity(i);
            }
        });
    }
}

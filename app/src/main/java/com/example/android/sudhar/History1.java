package com.example.android.sudhar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class History1 extends AppCompatActivity {
    Button track;
    EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history1);
        track=(Button)findViewById(R.id.a3);
        number=(EditText)findViewById(R.id.a2);
        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(History1.this,History2.class);
                i.putExtra("num",number.getText().toString());
                startActivity(i);

            }
        });
    }
}

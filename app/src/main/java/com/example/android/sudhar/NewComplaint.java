package com.example.android.sudhar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class NewComplaint extends AppCompatActivity {
    private Button A;
    private Spinner dropdown;
    EditText B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_complaint);
        A=(Button)findViewById(R.id.b5);
        dropdown=(Spinner)findViewById(R.id.a4);
        B=(EditText)findViewById(R.id.a1);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NewComplaint.this,Pop.class);
                i.putExtra("num",B.getText().toString());

                startActivity(i);
            }
        });
        final String[] items = new String[]{"Grievence","Suggestion","Public Grievance","Other"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(NewComplaint.this,android.R.layout.simple_spinner_dropdown_item,items);

        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(NewComplaint.this,items[i],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}

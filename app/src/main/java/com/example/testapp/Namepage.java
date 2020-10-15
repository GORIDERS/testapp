package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Namepage extends AppCompatActivity {
private EditText textname;
private Button buttonp;
private Button buttn;
Context context = this;
String randomstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namepage);

        buttonp = findViewById(R.id.ebtnp);
 buttn = findViewById(R.id.button2);
        String[] arrays = context.getResources().getStringArray(R.array.myarray);
        final TextView textname = (TextView) findViewById(R.id.textView);
        for (int i = 0; i <arrays.length; i++)
        {
            randomstr = arrays[i];
        }

        buttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] names = getResources().getStringArray(R.array.myarray);
                Random ran = new Random();
                int n = ran.nextInt(textname.length()-1);
                textname.setText(names[4]);
            }
        });
        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Namepage.this, MainActivity.class));
            }
        });
    }
}
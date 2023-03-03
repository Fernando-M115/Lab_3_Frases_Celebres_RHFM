package com.example.lab3frasescelebresrhfm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtRandom;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtRandom = (TextView) findViewById(R.id.txtNumeroRandom);
    }
    public void generateNumber(View view) {
        number = new Random().nextInt((3-1)+1)+1;
        txtRandom.setText(String.valueOf(number));

    }

    public void generarSegundaActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("numeroEnviado",number);
        startActivity(intent);
    }
}
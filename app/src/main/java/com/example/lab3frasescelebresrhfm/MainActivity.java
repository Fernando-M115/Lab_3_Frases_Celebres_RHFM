package com.example.lab3frasescelebresrhfm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Declaramos 2 variables, una de tipo textview para cambiar el texto con el metodo
    //Y un int para tener acceso al numero random generado
    private TextView txtRandom;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tomamos el valor del txtNumeroRandom y se lo asignamos a nuestra variable declarada
        txtRandom = (TextView) findViewById(R.id.txtNumeroRandom);
    }

    //Generamos un numero aleatorio, lo asignamos a la variable y luego lo mostramos en el txtView
    public void generateNumber(View view) {
        number = new Random().nextInt((3-1)+1)+1;
        txtRandom.setText(String.valueOf(number));

    }

    //Metodo que manda el Intent a la segunda activity con el int del numero random generado
    public void generarSegundaActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("numeroEnviado",number);
        startActivity(intent);
    }
}
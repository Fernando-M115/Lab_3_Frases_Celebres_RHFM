package com.example.lab3frasescelebresrhfm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private ImageView imagen;
    private TextView autor;
    private TextView frase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Recibimos el valor de la otra activity
        Intent intent = getIntent();
        int valor = intent.getIntExtra("numeroEnviado", 0);
        imagen = findViewById(R.id.imagenPersonaje);
        autor = findViewById(R.id.textAutor);
        frase = findViewById(R.id.textFrase);
        if (valor == 1) {
            imagen.setImageResource(R.drawable.gregory_house);

            autor.setText(R.string.Autor_1);

            frase.setText(R.string.Frase_1);
        } else if (valor ==2) {
            imagen.setImageResource(R.drawable.ockham);

            autor.setText(R.string.Autor_2);

            frase.setText(R.string.Frase_2);
        } else if (valor ==3) {
            imagen.setImageResource(R.drawable.rocki);

            autor.setText(R.string.Autor_3);

            frase.setText(R.string.Frase_3);
        }
    }
}
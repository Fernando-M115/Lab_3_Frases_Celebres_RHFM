package com.example.lab3frasescelebresrhfm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Declaracion de las variables para tener acceso y control de los recursos utilizados
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

        //Tomamos el control de los recursos y los asignamos a las variables para poder cambiarlos
        imagen = findViewById(R.id.imagenPersonaje);
        autor = findViewById(R.id.textAutor);
        frase = findViewById(R.id.textFrase);

        //Un if para saber cual numero es y mostrar los valores correspondientes
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
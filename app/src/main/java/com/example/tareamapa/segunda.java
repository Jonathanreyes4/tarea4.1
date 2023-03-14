package com.example.tareamapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segunda extends AppCompatActivity {

    private EditText codigoEditText;
    private EditText correoEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        codigoEditText = findViewById(R.id.codigoEditText);
        correoEditText = findViewById(R.id.correoEditText);

        Button siguienteButton = findViewById(R.id.verificarButton);
        siguienteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String codigo = codigoEditText.getText().toString();
                String correo = correoEditText.getText().toString();
                Persona persona = new Persona(codigo, correo);

                Intent intent = new Intent(segunda.this, Tercera.class);
                intent.putExtra("persona", persona);
                startActivity(intent);
            }
        });

    }
}
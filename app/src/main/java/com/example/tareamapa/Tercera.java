package com.example.tareamapa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tercera extends AppCompatActivity {

    private TextView codigoTextView;
    private TextView correoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        codigoTextView = findViewById(R.id.codigoTextView);
        correoTextView = findViewById(R.id.correoTextView);

        Persona persona = getIntent().getParcelableExtra("persona");
        codigoTextView.setText("Código: " + persona.getCodigo());
        correoTextView.setText("Correo: " + persona.getCorreo());
    }
}
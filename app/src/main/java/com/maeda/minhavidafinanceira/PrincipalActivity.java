package com.maeda.minhavidafinanceira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // atribui um título para a páginga (activity)
        setTitle(R.string.app_name);
    }

    // método que irá abrir activity Calcular Prestações
    public void calcularPrestacoes(View view) {
        // abre activity
        startActivity(new Intent(PrincipalActivity.this, CalcularPrestacoesActivity.class));
    }

    // método que irá abrir activity Valor Futuro
    public void valorFuturo(View view) {
        // abre activity
        startActivity(new Intent(PrincipalActivity.this, ValorFuturoActivity.class));
    }

    // método que irá abrir activity Sobre
    public void sobre(View view) {
        // abre activity
        startActivity(new Intent(PrincipalActivity.this, SobreActivity.class));
    }
}

package com.example.formativa;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActividad extends AppCompatActivity {

    private TextView tvResultadoFinal;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_actividad);

        tvResultadoFinal = findViewById(R.id.tvResultadoFinal);
        btnRegresar = findViewById(R.id.btnRegresar);

        Intent intent = getIntent();
        String resultado = intent.getStringExtra("resultado");
        tvResultadoFinal.setText("Resultado: " + resultado);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

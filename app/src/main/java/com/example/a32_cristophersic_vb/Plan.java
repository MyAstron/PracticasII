package com.example.a32_cristophersic_vb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Plan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan);

        TextView edtHoras = findViewById(R.id.edtHoras),
                edtCosto = findViewById(R.id.edtCosto);
        TextView txtImporte = findViewById(R.id.txtImporte);
        Button btnCalcular = findViewById(R.id.btnCalcular),
                btnSalir = findViewById(R.id.btnSalir);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Horas = Double.parseDouble(edtHoras.getText().toString()),
                        Costo = Double.parseDouble(edtCosto.getText().toString()),
                        Importe = Horas * Costo;

                txtImporte.setText(Importe+"");
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salida = new Intent(getApplication(), Menu.class);
                startActivity(salida);
            }
        });
    }
}
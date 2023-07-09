package com.example.a32_cristophersic_vb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calc extends AppCompatActivity {

    double Numero1 = 0, Numero2 = 0, Resultado = 0;
    int Operacion = 0;
    EditText edtOperaciones;
    Button No0, No1, No2, No3, No4, No5, No6, No7, No8, No9, btnPunto, btnSuma, btnResta, btnDivision, btnMultiplicacion, btnBorrar, btnIgual, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);

        edtOperaciones = (EditText) findViewById(R.id.edtOperacion);
        No0 = (Button) findViewById(R.id.btnNo0);
        No1 = (Button) findViewById(R.id.btnNo1);
        No2 = (Button) findViewById(R.id.btnNo2);
        No3 = (Button) findViewById(R.id.btnNo3);
        No4 = (Button) findViewById(R.id.btnNo4);
        No5 = (Button) findViewById(R.id.btnNo5);
        No6 = (Button) findViewById(R.id.btnNo6);
        No7 = (Button) findViewById(R.id.btnNo7);
        No8 = (Button) findViewById(R.id.btnNo8);
        No9 = (Button) findViewById(R.id.btnNo9);
        btnPunto = (Button) findViewById(R.id.btnPunto);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnDivision = (Button) findViewById(R.id.btnDivi);
        btnMultiplicacion = (Button) findViewById(R.id.btnMulti);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnSalir = (Button) findViewById(R.id.btnSalir);

        // Boton No0
        No0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtOperaciones.getText().toString().isEmpty()) {
                    return;
                } else {
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"0");
                }
            }
        });

        // Boton No1
        No1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOperaciones.setText(edtOperaciones.getText().toString()+"1");
            }
        });

        // Boton No2
        No2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOperaciones.setText(edtOperaciones.getText().toString()+"2");
            }
        });

        // Boton No3
        No3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOperaciones.setText(edtOperaciones.getText().toString()+"3");
            }
        });

        // Boton No4
        No4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOperaciones.setText(edtOperaciones.getText().toString()+"4");
            }
        });

        // Boton No5
        No5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOperaciones.setText(edtOperaciones.getText().toString()+"5");
            }
        });

        // Boton No6
        No6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOperaciones.setText(edtOperaciones.getText().toString()+"6");
            }
        });

        // Boton No7
        No7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOperaciones.setText(edtOperaciones.getText().toString()+"7");
            }
        });

        // Boton No8
        No8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOperaciones.setText(edtOperaciones.getText().toString()+"8");
            }
        });

        // Boton No9
        No9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOperaciones.setText(edtOperaciones.getText().toString()+"9");
            }
        });

        // Boton del Punto
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtOperaciones.getText().toString().isEmpty()) {
                    edtOperaciones.setText("0.");
                } else {
                    edtOperaciones.setText(edtOperaciones.getText().toString()+".");
                }
            }
        });

        // Boton de Sumar
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Numero1 != 0 || Operacion != 0){
                    return;
                }
                Numero1 = Double.parseDouble(edtOperaciones.getText().toString());
                Operacion = 1;
                edtOperaciones.setText("");
            }
        });

        // Boton de Restar
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Numero1 != 0 || Operacion != 0){
                    return;
                }
                Numero1 = Double.parseDouble(edtOperaciones.getText().toString());
                Operacion = 2;
                edtOperaciones.setText("");
            }
        });

        // Boton de Multiplicar
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Numero1 != 0 || Operacion != 0){
                    return;
                }
                Numero1 = Double.parseDouble(edtOperaciones.getText().toString());
                Operacion = 3;
                edtOperaciones.setText("");
            }
        });

        // Boton de Dividir
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Numero1 != 0 || Operacion != 0){
                    return;
                }
                Numero1 = Double.parseDouble(edtOperaciones.getText().toString());
                Operacion = 4;
                edtOperaciones.setText("");
            }
        });

        // Boton Borrar
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numero1 = 0;
                Numero2 = 0;
                Resultado = 0;
                Operacion = 0;
                edtOperaciones.setText("");
            }
        });

        // Boton igual
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Numero1 == 0 || Resultado != 0 || Operacion == 0) {
                    return;
                }
                Numero2 = Double.parseDouble(edtOperaciones.getText().toString());
                if (Operacion == 1){
                    Resultado = Numero1 + Numero2;
                } else if (Operacion == 2) {
                    Resultado = Numero1 - Numero2;
                } else if (Operacion == 3) {
                    Resultado = Numero1 * Numero2;
                } else if (Operacion == 4) {
                    Resultado = Numero1 / Numero2;
                }
                edtOperaciones.setText("R// "+Resultado);
            }
        });

        // Boton de salida
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salida = new Intent(getApplication(), MainActivity.class);
                startActivity(salida);
            }
        });
    }
}
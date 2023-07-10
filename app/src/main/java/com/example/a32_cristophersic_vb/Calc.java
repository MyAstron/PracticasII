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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);

        EditText edtOperaciones = findViewById(R.id.edtOperacion);
        Button No0 = findViewById(R.id.btnNo0),
                No1 = findViewById(R.id.btnNo1),
                No2 = findViewById(R.id.btnNo2),
                No3 = findViewById(R.id.btnNo3),
                No4 = findViewById(R.id.btnNo4),
                No5 = findViewById(R.id.btnNo5),
                No6 = findViewById(R.id.btnNo6),
                No7 = findViewById(R.id.btnNo7),
                No8 = findViewById(R.id.btnNo8),
                No9 = findViewById(R.id.btnNo9),
                btnPunto = findViewById(R.id.btnPunto),
                btnSuma = findViewById(R.id.btnSuma),
                btnResta = findViewById(R.id.btnResta),
                btnDivision =  findViewById(R.id.btnDivi),
                btnMultiplicacion = findViewById(R.id.btnMulti),
                btnBorrar = findViewById(R.id.btnBorrar),
                btnIgual = findViewById(R.id.btnIgual),
                btnSalir = findViewById(R.id.btnSalir);

        No0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0 || edtOperaciones.getText().toString().isEmpty() || edtOperaciones.getText().toString().startsWith("("))
                    return;
                else
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"0");

            }
        });

        No1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0) return;
                else if (edtOperaciones.getText().toString().startsWith("("))
                    edtOperaciones.setText("1");
                else
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"1");
            }
        });

        No2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0) return;
                else if (edtOperaciones.getText().toString().startsWith("("))
                    edtOperaciones.setText("2");
                else
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"2");
            }
        });

        No3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0) return;
                else if (edtOperaciones.getText().toString().startsWith("("))
                    edtOperaciones.setText("3");
                else
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"3");
            }
        });

        No4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0) return;
                else if (edtOperaciones.getText().toString().startsWith("("))
                    edtOperaciones.setText("4");
                else
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"4");
            }
        });

        No5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0) return;
                else if (edtOperaciones.getText().toString().startsWith("("))
                    edtOperaciones.setText("5");
                else
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"5");
            }
        });

        No6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0) return;
                else if (edtOperaciones.getText().toString().startsWith("("))
                    edtOperaciones.setText("6");
                else
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"6");
            }
        });

        No7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0) return;
                else if (edtOperaciones.getText().toString().startsWith("("))
                    edtOperaciones.setText("7");
                else
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"7");
            }
        });

        No8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0) return;
                else if (edtOperaciones.getText().toString().startsWith("("))
                    edtOperaciones.setText("8");
                else
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"8");
            }
        });

        No9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0) return;
                else if (edtOperaciones.getText().toString().startsWith("("))
                    edtOperaciones.setText("9");
                else
                    edtOperaciones.setText(edtOperaciones.getText().toString()+"9");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0) return;
                else if (edtOperaciones.getText().toString().contains("."))
                    return;
                else if (edtOperaciones.getText().toString().startsWith("("))
                    return;
                else if (edtOperaciones.getText().toString().isEmpty())
                    edtOperaciones.setText("0.");
                else edtOperaciones.setText(edtOperaciones.getText().toString()+".");
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Operacion != 0 || Resultado != 0 || edtOperaciones.getText().toString().startsWith("("))
                    return;
                Numero1 = Double.parseDouble(edtOperaciones.getText().toString());
                Operacion = 1;
                edtOperaciones.setText("(+) Suma");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0 || Operacion != 0 || edtOperaciones.getText().toString().startsWith("("))
                    return;
                Numero1 = Double.parseDouble(edtOperaciones.getText().toString());
                Operacion = 2;
                edtOperaciones.setText("(─) Resta");
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0 || Operacion != 0 || edtOperaciones.getText().toString().startsWith("("))
                    return;
                Numero1 = Double.parseDouble(edtOperaciones.getText().toString());
                Operacion = 3;
                edtOperaciones.setText("(×) Multiplicacion");
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Resultado != 0 || Operacion != 0 || edtOperaciones.getText().toString().startsWith("("))
                    return;
                Numero1 = Double.parseDouble(edtOperaciones.getText().toString());
                Operacion = 4;
                edtOperaciones.setText("(/) Division");
            }
        });

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

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Numero1 == 0 || Resultado != 0 || Operacion == 0) return;
                Numero2 = Double.parseDouble(edtOperaciones.getText().toString());
                switch (Operacion) {
                    case 1:
                        Resultado = Numero1 + Numero2;
                        break;
                    case 2:
                        Resultado = Numero1 - Numero2;
                        break;
                    case 3:
                        Resultado = Numero1 * Numero2;
                        break;
                    case 4:
                        Resultado = Numero1 / Numero2;
                        break;
                    default:
                        Resultado = Numero1 + Numero2;
                        break;
                }
                edtOperaciones.setText("R// "+Resultado);
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
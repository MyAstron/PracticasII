package com.example.a32_cristophersic_vb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class Menu extends AppCompatActivity {

    String[] apps = {
            "Calculadora",
            "Calculo de Importe",
            "Reproductor Multimedia"
    };
    int[] imagenes = {
            R.drawable.calculos,
            R.drawable.lista,
            R.drawable.audifonos
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        ListView lsvItems = findViewById(R.id.Lista);
        Adapter adaptarlo = new Adaptador(this, apps, imagenes);
        lsvItems.setAdapter((ListAdapter) adaptarlo);

        lsvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int Seleccion, long l) {
                switch (Seleccion) {
                    case 0:
                        Intent calcu = new Intent(getApplication(), Calc.class);
                        startActivity(calcu);
                        break;
                    case 1:
                        Intent plani = new Intent(getApplication(), Plan.class);
                        startActivity(plani);
                        break;
                    case 2:
                        Intent multi = new Intent(getApplication(), Mult.class);
                        startActivity(multi);
                        break;
                    default:
                        Intent menu = new Intent(getApplication(), Menu.class);
                        startActivity(menu);
                        break;
                }
            }
        });
    }
}

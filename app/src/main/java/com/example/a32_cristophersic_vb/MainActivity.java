package com.example.a32_cristophersic_vb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText  User = (EditText) findViewById(R.id.Usuario),
                Pass = (EditText) findViewById(R.id.Contra);
        Button btnAcceder = (Button) findViewById(R.id.Iniciar);

        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (User.getText().toString().toLowerCase().equals("sic") && Pass.getText().toString().equals("2015")){
                    Intent cambio = new Intent(getApplication(), Menu.class);
                    startActivity(cambio);
                } else {
                    Toast.makeText(getApplication(), "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
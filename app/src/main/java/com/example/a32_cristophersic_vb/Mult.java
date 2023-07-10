package com.example.a32_cristophersic_vb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Mult extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer Player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mult);

        ImageView imgAudio1 = findViewById(R.id.imgAudio1),
                imgAudio2 = findViewById(R.id.imgAudio2),
                imgAudio3 = findViewById(R.id.imgAudio3),
                imgAudio4 = findViewById(R.id.imgAudio4);
        Button btnSalir = findViewById(R.id.btnSalir);

        imgAudio1.setOnClickListener(this);
        imgAudio2.setOnClickListener(this);
        imgAudio3.setOnClickListener(this);
        imgAudio4.setOnClickListener(this);

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Salir = new Intent(getApplication(), Menu.class);
                startActivity(Salir);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (Player != null) Player.release();
        int id = view.getId();

        if (id == R.id.imgAudio1) {
            Player = MediaPlayer.create(this, R.raw.audio1);
        } else if (id == R.id.imgAudio2) {
            Player = MediaPlayer.create(this, R.raw.audio2);
        } else if (id == R.id.imgAudio3) {
            Player = MediaPlayer.create(this, R.raw.audio3);
        } else if (id == R.id.imgAudio4) {
            Player = MediaPlayer.create(this, R.raw.audio4);
        }

        Player.seekTo(0);
        Player.start();
    }

    @Override
    public void onPause(){
        super.onPause();;
        if (Player != null) Player.release();
    }
}
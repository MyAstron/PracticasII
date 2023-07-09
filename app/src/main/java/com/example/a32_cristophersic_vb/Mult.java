package com.example.a32_cristophersic_vb;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Mult extends AppCompatActivity implements View.OnClickListener {

    ImageView imgAudio1, imgAudio2, imgAudio3, imgAudio4;
    MediaPlayer Player;
    Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mult);

        imgAudio1 = (ImageView) findViewById(R.id.imgAudio1);
        imgAudio2 = (ImageView) findViewById(R.id.imgAudio2);
        imgAudio3 = (ImageView) findViewById(R.id.imgAudio3);
        imgAudio4 = (ImageView) findViewById(R.id.imgAudio4);
        btnSalir = (Button) findViewById(R.id.btnSalir);

        imgAudio1.setOnClickListener(this);
        imgAudio2.setOnClickListener(this);
        imgAudio3.setOnClickListener(this);
        imgAudio4.setOnClickListener(this);
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
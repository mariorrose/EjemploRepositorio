package com.example.approl;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ProgressBar;

import android.animation.ObjectAnimator;

import android.view.animation.DecelerateInterpolator;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ObjectAnimator anim;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);

        anim = ObjectAnimator.ofInt(progressBar, "progress", 0, 100);
        mostrarProgress();
    }

    private void mostrarProgress(){
        //agregamos el tiempo de la animacion a mostrar
        anim.setDuration(5000);
        anim.setInterpolator(new DecelerateInterpolator());
        //iniciamos el progressbar
        anim.start();

    }
    protected void onResume(){
        super.onResume();

        Toast.makeText(this, "Hola", Toast.LENGTH_LONG).show();
    }
}

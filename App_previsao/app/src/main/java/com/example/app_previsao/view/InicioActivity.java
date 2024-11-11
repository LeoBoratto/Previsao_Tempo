package com.example.app_previsao.view;

import android.os.Bundle;

;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Handler;

import com.example.app_previsao.R;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        // Exibir a Splash Screen por 3 segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Após 3 segundos, iniciar a MainActivity
                Intent intent = new Intent(InicioActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finalizar a Splash Screen para que o usuário não possa voltar
            }
        }, 3000); // 3000 milissegundos = 3 segundos
    }
}
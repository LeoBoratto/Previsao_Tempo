package com.example.app_previsao.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import androidx.appcompat.app.AppCompatActivity;

import com.example.app_previsao.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Botão para Previsão do Tempo
        Button buttonWeather = findViewById(R.id.buttonWeather);
        buttonWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
                startActivity(intent);
            }
        });

        // Botão para Sobre o Criador
        Button buttonAbout = findViewById(R.id.buttonAbout);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        // Botão para Tela em Branco
        Button buttonBlank = findViewById(R.id.buttonBlank);
        buttonBlank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CidadeActivity.class);
                startActivity(intent);
            }
        });

        // Botão para abrir o menu popup
        Button buttonMenu = findViewById(R.id.buttonMenu);
        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cria o PopupMenu e adiciona itens manualmente
                PopupMenu popup = new PopupMenu(MainActivity.this, v);
                popup.getMenu().add(0, 0, 0, "Previsão do Tempo");
                popup.getMenu().add(0, 1, 1, "Sobre o Criador");
                popup.getMenu().add(0, 2, 2, "Tela em Branco");

                // Define ações para cada item do menu popup
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case 0: // Previsão do Tempo
                                startActivity(new Intent(MainActivity.this, WeatherActivity.class));
                                return true;
                            case 1: // Sobre o Criador
                                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                                return true;
                            case 2: // Tela em Branco
                                startActivity(new Intent(MainActivity.this, CidadeActivity.class));
                                return true;
                            default:
                                return false;
                        }
                    }
                });
                popup.show();
            }
        });
    }
}

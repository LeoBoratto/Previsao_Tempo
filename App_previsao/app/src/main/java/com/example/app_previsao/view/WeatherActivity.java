package com.example.app_previsao.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.app_previsao.R;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);  // Corrigido para o nome correto do layout
    }
}

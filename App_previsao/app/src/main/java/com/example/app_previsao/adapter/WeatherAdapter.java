package com.example.app_previsao.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.app_previsao.R;
import com.example.app_previsao.model.WeatherResponse;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {
    private List<WeatherResponse.Forecast> forecastList;
    private Context context;

    public WeatherAdapter(List<WeatherResponse.Forecast> forecastList, Context context) {
        this.forecastList = forecastList;
        this.context = context;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_inicio, parent, false);
        return new WeatherViewHolder(view);

    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        WeatherResponse.Forecast forecast = forecastList.get(position);
        holder.dateText.setText(forecast.getDate());
        holder.descriptionText.setText(forecast.getDescription());
        holder.temperatureText.setText(forecast.getTemperature());
    }

    @Override
    public int getItemCount() {
        return forecastList.size();
    }

    public static class WeatherViewHolder extends RecyclerView.ViewHolder {
        TextView dateText, descriptionText, temperatureText;

        public WeatherViewHolder(View itemView) {
            super(itemView);

        }
    }
}

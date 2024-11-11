package com.example.app_previsao.interfalcecone;

import com.example.app_previsao.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("weather")
    Call<WeatherResponse> getWeatherData(@Query("key") String key, @Query("city_name") String cityName);
}

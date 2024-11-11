package com.example.app_previsao.model;

import java.util.List;

public class WeatherResponse {
    private List<Forecast> results;

    public WeatherResponse() {

    }

    public List<Forecast> getResults() {
        return results;
    }

    public void setResults(List<Forecast> results) {
        this.results = results;
    }


    public class Forecast {
        private String date;
        private String description;
        private String temperature;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }
    }
}
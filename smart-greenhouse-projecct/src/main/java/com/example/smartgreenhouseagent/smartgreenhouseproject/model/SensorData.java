package com.example.smartgreenhouseagent.smartgreenhouseproject.model;

public class SensorData {

    private double temperature;
    private double humidity;
    private double co2;

    public SensorData(double temperature, double humidity, double co2) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.co2 = co2;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getCo2() {
        return co2;
    }
}

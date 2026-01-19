package com.example.smartgreenhouseagent.smartgreenhouseproject.model;

public class DecisionResult {

    private String fan;
    private String humidifier;
    private String co2Valve;
    private String light;

    public DecisionResult(String fan, String humidifier, String co2Valve, String light) {
        this.fan = fan;
        this.humidifier = humidifier;
        this.co2Valve = co2Valve;
        this.light = light;
    }

    public String getFan() {
        return fan;
    }

    public String getHumidifier() {
        return humidifier;
    }

    public String getCo2Valve() {
        return co2Valve;
    }

    public String getLight() {
        return light;
    }
}

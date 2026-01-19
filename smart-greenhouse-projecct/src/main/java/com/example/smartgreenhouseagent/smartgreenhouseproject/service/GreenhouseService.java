package com.example.smartgreenhouseagent.smartgreenhouseproject.service;

import org.springframework.stereotype.Service;
import com.example.smartgreenhouseagent.smartgreenhouseproject.model.*;

@Service
public class GreenhouseService {

    // Simulated sensor data
    public SensorData readSensors() {
        return new SensorData(22.5, 45.0, 420.0);
    }

    // AI decision logic
    public DecisionResult makeDecision(SensorData data) {

        String fan = "OFF";
        String humidifier = "OFF";
        String co2Valve = "CLOSED";
        String light = "OFF";

        if (data.getTemperature() > 30) {
            fan = "ON";
        }

        if (data.getHumidity() < 40) {
            humidifier = "ON";
        }

        if (data.getCo2() < 350) {
            co2Valve = "OPEN";
        }

        if (data.getTemperature() < 20) {
            light = "ON";
        }

        return new DecisionResult(fan, humidifier, co2Valve, light);
    }
}

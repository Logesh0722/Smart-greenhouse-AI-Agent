package com.example.smartgreenhouseagent.smartgreenhouseproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smartgreenhouseagent.smartgreenhouseproject.model.*;
import com.example.smartgreenhouseagent.smartgreenhouseproject.service.GreenhouseService;

@RestController
public class GreenhouseController {

    private final GreenhouseService greenhouseService;

    public GreenhouseController(GreenhouseService greenhouseService) {
        this.greenhouseService = greenhouseService;
    }

    @GetMapping("/status")
    public String status() {
        return "Smart Greenhouse AI Agent is running";
    }

    @GetMapping("/sensors")
    public SensorData sensors() {
        return greenhouseService.readSensors();
    }

    @GetMapping("/decision")
    public DecisionResult decision() {
        SensorData data = greenhouseService.readSensors();
        return greenhouseService.makeDecision(data);
    }
}

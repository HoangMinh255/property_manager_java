package com.example.Gateway.Presentation.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Gateway.Configuration.GatewayProperties;

@RestController
public class GatewayController {
    private final GatewayProperties properties;

    public GatewayController(GatewayProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/gateway/routes")
    public Map<String, String> routes() {
        return Map.of(
                "premise", properties.premiseUrl(),
                "ticketAndNotification", properties.notificationUrl());
    }
}

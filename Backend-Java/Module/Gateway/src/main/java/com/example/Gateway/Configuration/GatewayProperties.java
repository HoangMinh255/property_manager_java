package com.example.Gateway.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "gateway.services")
public record GatewayProperties(String premiseUrl, String notificationUrl) {
}

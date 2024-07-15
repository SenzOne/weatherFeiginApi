package com.slaschinin.weather.controller.model;

import java.time.LocalDateTime;

public record WeatherRequest(Double longitude, Double latitude, LocalDateTime date) {
}

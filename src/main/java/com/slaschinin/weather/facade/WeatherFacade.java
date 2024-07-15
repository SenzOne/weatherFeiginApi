package com.slaschinin.weather.facade;

import com.slaschinin.weather.controller.model.WeatherRequest;
import com.slaschinin.weather.controller.model.WeatherResponse;
import com.slaschinin.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherFacade {

    private final WeatherService weatherService;

    public WeatherResponse getWeather(WeatherRequest request) {
        return weatherService.getWeather(
                request.longitude(),
                request.latitude(),
                request.date()).map(weatherModel ->
                new WeatherResponse(
                        weatherModel.date(),
                        weatherModel.temperature() + weatherModel.type().name()
                )).orElse(WeatherResponse.empty());
    }
}

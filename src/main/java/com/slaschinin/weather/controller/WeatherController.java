package com.slaschinin.weather.controller;

import com.slaschinin.weather.controller.model.WeatherRequest;
import com.slaschinin.weather.controller.model.WeatherResponse;
import com.slaschinin.weather.facade.WeatherFacade;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherFacade weatherFacade;

    @PostMapping
    public WeatherResponse getWeather(@RequestBody final WeatherRequest request) {
        return weatherFacade.getWeather(request);
    }
}

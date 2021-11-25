package ru.gb_cource2.lesson7.accuWeather;

import java.util.List;

public class AccuWeatherClass {
    private Headline Headline;
    private List<DailyForecast> DailyForecasts;

    public void setHeadline(Headline Headline) {
        this.Headline = Headline;
    }

    public Headline getHeadline() {
        return Headline;
    }

    public void setDailyForecasts(List<DailyForecast> DailyForecasts) {
        this.DailyForecasts = DailyForecasts;
    }

    public List<DailyForecast> getDailyForecasts() {
        return DailyForecasts;
    }
}

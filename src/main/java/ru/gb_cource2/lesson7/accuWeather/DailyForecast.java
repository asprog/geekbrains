package ru.gb_cource2.lesson7.accuWeather;

import java.util.Date;
import java.util.List;

public class DailyForecast {

    private Date Date;
    private long EpochDate;
    private Temperature Temperature;
    private Day Day;
    private Night Night;
    private List<String> Sources;
    private String MobileLink;
    private String Link;
    public void setDate(Date Date) {
        this.Date = Date;
    }
    public Date getDate() {
        return Date;
    }

    public void setEpochDate(long EpochDate) {
        this.EpochDate = EpochDate;
    }
    public long getEpochDate() {
        return EpochDate;
    }

    public void setTemperature(Temperature Temperature) {
        this.Temperature = Temperature;
    }
    public Temperature getTemperature() {
        return Temperature;
    }

    public void setDay(Day Day) {
        this.Day = Day;
    }
    public Day getDay() {
        return Day;
    }

    public void setNight(Night Night) {
        this.Night = Night;
    }
    public Night getNight() {
        return Night;
    }

    public void setSources(List<String> Sources) {
        this.Sources = Sources;
    }
    public List<String> getSources() {
        return Sources;
    }

    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }
    public String getMobileLink() {
        return MobileLink;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }
    public String getLink() {
        return Link;
    }
}

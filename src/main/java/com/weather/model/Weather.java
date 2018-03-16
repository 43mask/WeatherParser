package com.weather.model;

public class Weather {

    private String date;
    private String day;
    private String state;
    private String temperatureDay;
    private String temperatureNight;

    public Weather() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTemperatureDay() {
        return temperatureDay;
    }

    public void setTemperatureDay(String temperatureDay) {
        this.temperatureDay = temperatureDay;
    }

    public String getTemperatureNight() {
        return temperatureNight;
    }

    public void setTemperatureNight(String temperatureNight) {
        this.temperatureNight = temperatureNight;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", state='" + state + '\'' +
                ", temperatureDay='" + temperatureDay + '\'' +
                ", temperatureNight='" + temperatureNight + '\'' +
                '}';
    }
}

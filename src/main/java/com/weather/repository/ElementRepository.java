package com.weather.repository;

import com.weather.logic.LogicWeather;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class ElementRepository extends LogicWeather {

    public ElementRepository() throws IOException {
    }

    //CSS query to website
    private Elements days = getPage().select("span[class=day]");
    private Elements dates = getPage().select("span[class=date]");
    private Elements states = getPage().select("span[class=weather-forecast-longterm-list-entry-forecast-phrase]");
    private Elements temperatureDay = getPage().select("span[class=weather-forecast-longterm-list-entry-forecast-temp]");
    private Elements temperatureNight = getPage().select("span[class=weather-forecast-longterm-list-entry-forecast-lowtemp]");

    //Lists element website
    private List<String> daysList = getElementsStringList(days);
    private List<String> datesList = getElementsStringList(dates);
    private List<String> statesList = getElementsStringList(states);
    private List<String> temperatureDayList = getElementsStringList(temperatureDay);
    private List<String> temperatureNightList = getElementsStringList(temperatureNight);

    //Methods for get list element to index
    public String getDay(int index){
        return daysList.get(index);
    }

    public String getDate(int index){
        return datesList.get(index);
    }

    public String getState(int index){
        return statesList.get(index);
    }

    public String getTemperatureDay(int index){
        return temperatureDayList.get(index);
    }

    public String getTemperatureNight(int index){
        return temperatureNightList.get(index);
    }
}

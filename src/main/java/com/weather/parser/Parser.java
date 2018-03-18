package com.weather.parser;

import com.weather.repository.ElementRepository;



public class Parser {

    public static void main(String[] args) throws Exception {

        ElementRepository elementRepository = new ElementRepository();

        System.out.println(elementRepository.getDay(1));
        System.out.println(elementRepository.getDate(1));
        System.out.println(elementRepository.getState(1));
        System.out.println(elementRepository.getTemperatureDay(1));
        System.out.println(elementRepository.getTemperatureNight(1));

    }

}

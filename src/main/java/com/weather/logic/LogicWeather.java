package com.weather.logic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LogicWeather {

    //Method for get page with website
    public static Document getPage() throws IOException {
        String url ="https://pogoda.interia.pl/prognoza-dlugoterminowa-warszawa,cId,36917";
        Document page = Jsoup.parse(new URL(url), 5000);
        return page;
    }

    //Method to add string elements in list
    public List<String> getElementsStringList(Elements elements){

        List<String> elementsList = new ArrayList<String>();

        for (Element i : elements){
            elementsList.add(i.text());
        }

        return elementsList;
    }

}

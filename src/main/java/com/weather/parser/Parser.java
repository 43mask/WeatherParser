package com.weather.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;


public class Parser {

    private static Document getPage() throws IOException {
        String url ="https://pogoda.interia.pl/prognoza-dlugoterminowa-warszawa,cId,36917";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static void main(String[] args) throws Exception {
        Document page = getPage();

        //css query language
        Elements  days = page.select("span[class=day]");
        Elements dates = page.select("span[class=date]");
        Elements states = page.select("span[class=weather-forecast-longterm-list-entry-forecast-phrase]");
        Elements tempDays = page.select("div[class=table-temps]");

        String date = dates.get(2).text();
        String day = days.get(2).text();
        String state = states.get(2).text();
        String tempDay = tempDays.get(2).text();

        System.out.println(date + " " + day + " " + state + " " + tempDay);
    }
}

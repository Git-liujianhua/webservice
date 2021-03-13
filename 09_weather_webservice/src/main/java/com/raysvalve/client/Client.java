package com.raysvalve.client;

import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        WeatherWS weatherWS = new WeatherWS();

        WeatherWSSoap weatherWSSoap = weatherWS.getPort(WeatherWSSoap.class);

        List<String> list = weatherWSSoap.getWeather("温州", null).getString();

        for (String str: list) {
            System.out.println(str);
        }


    }
}

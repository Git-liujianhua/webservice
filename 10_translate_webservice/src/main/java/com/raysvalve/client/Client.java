package com.raysvalve.client;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.EnglishChinese;
import cn.com.webxml.EnglishChineseSoap;

import javax.xml.ws.Service;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        EnglishChinese englishChinese = new EnglishChinese();

        EnglishChineseSoap englishChineseSoap = englishChinese.getPort(EnglishChineseSoap.class);

        List<String> list = englishChineseSoap.translatorString("Chinese").getString();

        for (String str:list) {
            System.out.println(str);
        }

    }
}

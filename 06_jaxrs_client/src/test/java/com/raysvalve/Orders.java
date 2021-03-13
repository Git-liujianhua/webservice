package com.raysvalve;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Orders")
public class Orders {
    public Integer CardCode;
    public String CardName;
    public Integer CardFName;



    public Integer getCardCode() {
        return CardCode;
    }

    public void setCardCode(Integer cardCode) {
        CardCode = cardCode;
    }

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

    public Integer getCardFName() {
        return CardFName;
    }

    public void setCardFName(Integer cardFName) {
        CardFName = cardFName;
    }
    @Override
    public String toString() {
        return "Orders{" +
                "CardCode=" + CardCode +
                ", CardName='" + CardName + '\'' +
                ", CardFName=" + CardFName +
                '}';
    }
}

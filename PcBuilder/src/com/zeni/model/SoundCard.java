package com.zeni.model;

import com.zeni.logic.Displayable;

public class SoundCard extends Characteristics implements Displayable {
  private String audioChannels;
  private String connectorType;
  
  public static SoundCard[] SoundCardsCreate() {
    SoundCard[] soundCards = new SoundCard[5];
    soundCards[0] = new SoundCard(69.99, "Creative", "Sound Blaster Z", 2012, "5.1", "PCI Express");
    soundCards[1] = new SoundCard(99.99, "ASUS", "Xonar AE", 2016, "7.1", "PCI Express");
    soundCards[2] = new SoundCard(49.99, "Focusrite", "Scarlett Solo", 2018, "2.0", "USB");
    soundCards[3] = new SoundCard(129.99, "EVGA", "NU Audio Pro", 2019, "7.1", "PCI Express");
    soundCards[4] = new SoundCard(79.99, "Creative", "Sound BlasterX G6", 2018, "7.1", "USB");
    return soundCards;
  }
  
  public SoundCard(double price, String brand, String model, int year, String audioChannels, String connectorType) {
    super(price, brand, model, year);
    this.audioChannels = audioChannels;
    this.connectorType = connectorType;
  }
  
  public String getAudioChannels() {
    return audioChannels;
  }
  
  public String getConnectorType() {
    return connectorType;
  }
  
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Звукова карта" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Аудіо-канали='" + audioChannels + '\'' +
          ", Тип коннектора='" + connectorType + '\'';
    } else {
      return getModel();
    }
  }
}


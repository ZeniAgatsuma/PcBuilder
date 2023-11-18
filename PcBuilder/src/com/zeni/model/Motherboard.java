package com.zeni.model;

import com.zeni.logic.Displayable;

public class Motherboard extends Characteristics implements Displayable {
  private String socketType;
  private String formFactor;
  
  public static Motherboard[] MotherboardsCreat() {
    Motherboard[] motherboards = new Motherboard[7];
    motherboards[0] = new Motherboard(149.99, "ASUS", "ROG Strix Z590-E", 2021, "LGA1200", "ATX");
    motherboards[1] = new Motherboard(129.99, "MSI", "MAG B550 TOMAHAWK", 2020, "AM4", "ATX");
    motherboards[2] = new Motherboard(99.99, "GIGABYTE", "B450 AORUS ELITE", 2018, "AM4", "ATX");
    motherboards[3] = new Motherboard(189.99, "ASRock", "Z590 Phantom Gaming-ITX/TB4", 2021, "LGA1200", "Mini-ITX");
    motherboards[4] = new Motherboard(79.99, "MSI", "B450M PRO-VDH MAX", 2019, "AM4", "MicroATX");
    motherboards[5] = new Motherboard(149.99, "ASUS", "ROG Strix X570-E Gaming", 2019, "AM4", "ATX");
    motherboards[6] = new Motherboard(69.99, "ASRock", "H310M-HDV/M.2", 2018, "LGA1151", "MicroATX");
    return motherboards;
  }
  
  public Motherboard(double price, String brand, String model, int year, String socketType, String formFactor) {
    super(price, brand, model, year);
    this.socketType = socketType;
    this.formFactor = formFactor;
  }
  
  public String getSocketType() {
    return socketType;
  }
  
  public String getFormFactor() {
    return formFactor;
  }
  
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Материнська плата" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Сокет='" + socketType + '\'' +
          ", Форм-фактор='" + formFactor + '\'';
    } else {
      return getModel();
    }
  }
}


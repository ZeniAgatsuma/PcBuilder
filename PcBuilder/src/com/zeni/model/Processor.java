package com.zeni.model;

import com.zeni.logic.Displayable;

public class Processor extends Characteristics implements Displayable {
  private int frequency;
  private String socet;
  public static Processor[] ProcessorsCreat(){
    Processor[] processors = new Processor[7];
    processors[0] = new Processor(299.99, "Intel", "i5-10600K", 2020, 4500, "LGA1200");
    processors[1] = new Processor(399.99, "AMD", "Ryzen 7 5800X", 2020, 4700, "AM4");
    processors[2] = new Processor(499.99, "Intel", "i7-10700K", 2020, 4800, "LGA1200");
    processors[3] = new Processor(349.99, "AMD", "Ryzen 5 5600X", 2020, 4300, "AM4");
    processors[4] = new Processor(249.99, "Intel", "i5-10400F", 2020, 4200, "LGA1200");
    processors[5] = new Processor(329.99, "AMD", "Ryzen 5 3600", 2019, 3600, "AM4");
    processors[6] = new Processor(279.99, "Intel", "i5-9400F", 2019, 2900, "LGA1151");
    return processors;
  }
  public Processor(double price, String brand, String model, int year, int frequency,String socet) {
    super(price, brand, model, year);
    this.frequency = frequency;
    this.socet =socet;
  }
  public String getSocet(){
    return socet;
  }
  public int getFrequency() {
    return frequency;
  }
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Процессор" + " "+
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Частота=" + frequency +
          ", Сокет="+ socet;
    } else {
      return  "" + getModel() + '\'';
    }
  }
}

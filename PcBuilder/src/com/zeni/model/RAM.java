package com.zeni.model;

import com.zeni.logic.Displayable;

public class RAM extends Characteristics implements Displayable {
  private int speed; // Replaced power with speed
  private int capacity;
  private String memoryType;
  
  public static RAM[] RAMsCreat() {
    RAM[] rams = new RAM[7];
    rams[0] = new RAM(69.99, "Corsair", "Vengeance LPX 8GB", 2020, 3200, 8, "DDR4");
    rams[1] = new RAM(89.99, "G.Skill", "Ripjaws V 16GB", 2020, 3600, 16, "DDR4");
    rams[2] = new RAM(129.99, "Crucial", "Ballistix 32GB", 2020, 3200, 32, "DDR4");
    rams[3] = new RAM(49.99, "Kingston", "HyperX Fury 4GB", 2020, 2666, 4, "DDR4");
    rams[4] = new RAM(149.99, "Corsair", "Dominatоr Platinum 64GB", 2020, 3600, 64, "DDR4");
    rams[5] = new RAM(79.99, "ADATA", "XPG Z1 16GB", 2019, 3000, 16, "DDR4");
    rams[6] = new RAM(59.99, "Team Group", "T-Force Vulcan 8GB", 2019, 2400, 8, "DDR4");
    return rams;
  }
  
  public RAM(double price, String brand, String model, int year, int speed, int capacity, String memoryType) {
    super(price, brand, model, year);
    this.speed = speed;
    this.capacity = capacity;
    this.memoryType = memoryType;
  }
  
  public int getSpeed() {
    return speed;
  }
  
  public int getCapacity() {
    return capacity;
  }
  
  public String getMemoryType() {
    return memoryType;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Оперативна пам'ять" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Швидкість=" + speed +
          ", Обсяг пам'яті=" + capacity+"ГБ" +
          ", Тип пам'яті=" + memoryType;
    } else {
      return "" + getModel() + '\'';
    }
  }
}

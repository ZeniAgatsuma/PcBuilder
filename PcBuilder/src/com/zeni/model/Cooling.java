package com.zeni.model;

import com.zeni.logic.Displayable;

public class Cooling extends Characteristics implements Displayable {
  private int fanSpeed; // Replaced speed with fan speed
  private String coolingType; // Added cooling type (liquid or air)
  private int thermalPower; // Replaced memory capacity with thermal dissipation power
  
  public static Cooling[] CoolingsCreat() {
    Cooling[] coolings = new Cooling[7];
    coolings[0] = new Cooling(89.99, "NZXT", "Kraken X62", 2020, 2000, "Liquid", 250);
    coolings[1] = new Cooling(69.99, "Noctua", "NH-D15", 2020, 1500, "Air", 220);
    coolings[2] = new Cooling(129.99, "Corsair", "H100i RGB Platinum", 2020, 2400, "Liquid", 300);
    coolings[3] = new Cooling(49.99, "Cooler Master", "Hyper 212 EVO", 2020, 1600, "Air", 180);
    coolings[4] = new Cooling(149.99, "NZXT", "Kraken Z73", 2020, 2800, "Liquid", 320);
    coolings[5] = new Cooling(79.99, "be quiet!", "Dark Rock Pro 4", 2019, 1700, "Air", 200);
    coolings[6] = new Cooling(99.99, "Arctic", "Liquid Freezer II 240", 2019, 1800, "Liquid", 260);
    return coolings;
  }
  
  public Cooling(double price, String brand, String model, int year, int fanSpeed, String coolingType, int thermalPower) {
    super(price, brand, model, year);
    this.fanSpeed = fanSpeed;
    this.coolingType = coolingType;
    this.thermalPower = thermalPower;
  }
  
  public int getFanSpeed() {
    return fanSpeed;
  }
  
  public String getCoolingType() {
    return coolingType;
  }
  
  public int getThermalPower() {
    return thermalPower;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Система охолодження" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Швидкість обертів=" + fanSpeed +
          ", Тип охолодження=" + coolingType +
          ", Потужність тепловідводу=" + thermalPower;
    } else {
      return "" + getModel() + '\'';
    }
  }
}

package com.zeni.model;

import com.zeni.logic.Displayable;

public class PSU extends Characteristics implements Displayable {
  private int power; // Replaced frequency with power
  
  public static PSU[] PSUsCreat(){
    PSU[] psus = new PSU[7];
    psus[0] = new PSU(99.99, "Corsair", "CX550M", 2020, 550);
    psus[1] = new PSU(129.99, "EVGA", "SuperNOVA 650 G5", 2020, 650);
    psus[2] = new PSU(149.99, "Seasonic", "Focus GX-750", 2020, 750);
    psus[3] = new PSU(89.99, "Thermaltake", "Smart 500W", 2020, 500);
    psus[4] = new PSU(79.99, "Cooler Master", "MWE 500", 2020, 500);
    psus[5] = new PSU(109.99, "be quiet!", "Pure Power 11 600W", 2019, 600);
    psus[6] = new PSU(94.99, "Antec", "Earthwatts Gold Pro 550W", 2019, 550);
    return psus;
  }
  
  public PSU(double price, String brand, String model, int year, int power) {
    super(price, brand, model, year);
    this.power = power;
  }
  
  public int getPower() {
    return power;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Блок живлення" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Потужність=" + power;
    } else {
      return "" + getModel() + '\'';
    }
  }
}
package com.zeni.model;

import com.zeni.logic.Displayable;

public class HardDrive extends Characteristics implements Displayable {
  private int speed; // Replaced power with speed
  private int capacity;
  
  public static HardDrive[] HardDrivesCreat() {
    HardDrive[] hardDrives = new HardDrive[7];
    hardDrives[0] = new HardDrive(79.99, "Seagate", "Barracuda 1TB", 2020, 7200, 1000);
    hardDrives[1] = new HardDrive(99.99, "Western Digital", "WD Blue 2TB", 2020, 5400, 2000);
    hardDrives[2] = new HardDrive(129.99, "Samsung", "970 EVO 500GB", 2020, 3500, 500);
    hardDrives[3] = new HardDrive(59.99, "Crucial", "MX500 250GB", 2020, 560, 250);
    hardDrives[4] = new HardDrive(149.99, "Seagate", "FireCuda 2TB", 2020, 7200, 2000);
    hardDrives[5] = new HardDrive(69.99, "Kingston", "A2000 1TB", 2019, 2200, 1000);
    hardDrives[6] = new HardDrive(119.99, "SanDisk", "Ultra 3D 500GB", 2019, 560, 500);
    return hardDrives;
  }
  
  public HardDrive(double price, String brand, String model, int year, int speed, int capacity) {
    super(price, brand, model, year);
    this.speed = speed;
    this.capacity = capacity;
  }
  
  public int getSpeed() {
    return speed;
  }
  
  public int getCapacity() {
    return capacity;
  }
  
  @Override
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Жорсткий диск" + " " +
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Швидкість=" + speed +
          ", Обсяг пам'яті=" + capacity;
    } else {
      return "" + getModel() + '\'';
    }
  }
}
package com.zeni.model;

import com.zeni.logic.Displayable;

public class VideoCard extends Characteristics implements Displayable {
  private int frequency;
  private String memoryType;
  private int memorySize;
  public VideoCard(double price, String brand, String model, int year, int frequency, String memoryType, int memorySize) {
    super(price, brand, model, year);
    this.frequency = frequency;
    this.memoryType = memoryType;
    this.memorySize = memorySize;
  }
  
 
  public int getFrequency() {
    return frequency;
  }
  public String getMemoryType() {
    return memoryType;
  }
  public int getMemorySize() {
    return memorySize;
  }
  public static VideoCard[] VideoCarsCreat(){
    VideoCard[] videoCardsArray = new VideoCard[7];
    videoCardsArray[0] = new VideoCard(499.99, "NVIDIA", "RTX 3080", 2021, 1600, "GDDR6", 8);
    videoCardsArray[1] = new VideoCard(699.99, "AMD", "RX 6800", 2021, 1900, "GDDR6X", 10);
    videoCardsArray[2] = new VideoCard(299.99, "NVIDIA", "GTX 1660", 2020, 1400, "GDDR5", 6);
    videoCardsArray[3] = new VideoCard(599.99, "AMD", "RX 6700 XT", 2021, 1700, "GDDR6", 12);
    videoCardsArray[4] = new VideoCard(799.99, "NVIDIA", "RTX 3090", 2020, 1700, "GDDR6X", 24);
    videoCardsArray[5] = new VideoCard(249.99, "AMD", "RX 5600 XT", 2020, 1600, "GDDR6", 6);
    videoCardsArray[6] = new VideoCard(349.99, "NVIDIA", "GTX 1660 Ti", 2019, 1500, "GDDR6", 6);
    return videoCardsArray;
  }
  public String toString(boolean fullInfo) {
    if (fullInfo) {
      return "Відео карта{" + " "+
          "Ціна=" + getPrice() +
          ", Бренд='" + getBrand() + '\'' +
          ", Модель='" + getModel() + '\'' +
          ", Рік випуску=" + getYear() +
          ", Частота=" + frequency +
          ", Тип памяті='" + memoryType + '\'' +
          ", Обсяг памяті=" + memorySize +
          '}';
    } else {
      return  "" + getModel() + '\'';
    }
  }
 
}

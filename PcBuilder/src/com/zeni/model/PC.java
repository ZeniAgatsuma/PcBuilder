package com.zeni.model;

public class PC {
  private String videoCard;
  private String processor;
  private String motherboard;
  private String RAM;
 private String hardDrive;
  private String PSU;
  private String cooling;
  private String soundCard;
  
  private PC(Builder builder) {
    this.videoCard = builder.videoCard;
    this.processor = builder.processor;
    this.motherboard = builder.motherboard;
    this.RAM = builder.RAM;
    this.hardDrive = builder.hardDrive;
    this.PSU = builder.PSU;
    this.cooling = builder.cooling;
    this.soundCard=builder.soundCard;
    
  }
  
  public String getVideoCard() {
    return videoCard;
  }
  
  public String getProcessor() {
    return processor;
  }
  
  public String getMotherboard() {
    return motherboard;
  }
  public String getRAM() {
    return RAM;
  }
  
  public String getHardDrive() {
    return hardDrive;
  }
  
  public String getPSU() {
    return PSU;
  }
  
  public String getCooling() {
    return cooling;
  }
  public String getSoundCard(){
    return soundCard;
  }
  
  public static class Builder {
    private String videoCard;
    private String processor;
    private String motherboard;
    private String RAM;
    private String hardDrive;
    private String PSU;
    private String cooling;
    private String soundCard;
    
   
    public Builder videoCard(String videoCard) {
      this.videoCard = videoCard;
      return this;
    }
    public Builder soundCard(String soundCard){
      this.soundCard=soundCard;
      return this;
    }
    
    public Builder processor(String processor) {
      this.processor = processor;
      return this;
    }
    
    public Builder motherboard(String motherboard) {
      this.motherboard = motherboard;
      return this;
    }
    public Builder RAM(String RAM) {
      this.RAM = RAM;
      return this;
    }
    public Builder hardDrive(String hardDrive) {
      this.hardDrive = hardDrive;
      return this;
    }
    public Builder PSU(String PSU) {
      this.PSU = PSU;
      return this;
    }
    public Builder cooling(String cooling) {
      this.cooling = cooling;
      return this;
    }
    public PC build() {
      return new PC(this);
    }
  }
}

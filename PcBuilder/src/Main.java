
import static com.zeni.logic.Methods.selectAndDisplayComponent;

import com.zeni.logic.Methods;
import com.zeni.model.Cooling;
import com.zeni.model.HardDrive;
import com.zeni.model.Motherboard;
import com.zeni.model.PC;
import com.zeni.model.PSU;
import com.zeni.model.Processor;
import com.zeni.model.RAM;
import com.zeni.model.SoundCard;
import com.zeni.model.VideoCard;

public class Main {
  
  public static void main(String[] args) {
    Motherboard selectedMotherboard = Methods.selectAndDisplayComponent(Motherboard.MotherboardsCreat(), true);
    VideoCard selectedVideoCard = Methods.selectAndDisplayComponent(VideoCard.VideoCarsCreat(), true);
    Processor selectedProcessor = Methods.selectAndDisplayComponent(Processor.ProcessorsCreat(), true);
    PSU selectedPSU = Methods.selectAndDisplayComponent(PSU.PSUsCreat(), true);
    HardDrive selectedHardDrive = Methods.selectAndDisplayComponent(HardDrive.HardDrivesCreat(), true);
    RAM selectedRam = Methods.selectAndDisplayComponent(RAM.RAMsCreat(), true);
    Cooling selectedCooling = Methods.selectAndDisplayComponent(Cooling.CoolingsCreat(), true);
    SoundCard selectedSoundCard=Methods.promptUserForSoundCard();
  
    PC pc = new PC.Builder()
      .motherboard(selectedMotherboard.getModel())
      .processor(selectedProcessor.getModel())
      .videoCard(selectedVideoCard.getModel())
      .PSU(selectedPSU.getModel())
      .hardDrive(selectedHardDrive.getModel())
      .RAM(selectedRam.getModel())
      .cooling(selectedCooling.getModel())
      .soundCard(selectedSoundCard != null ? selectedSoundCard.getModel() : "немає")
      .build();
    
    System.out.print("Відеокарта: " + pc.getVideoCard() + "\n" +
        "Процесор: " + pc.getProcessor() + "\n" +
        "Материнська плата: " + pc.getMotherboard() + "\n" +
        "Блок живлення: " + pc.getPSU() + "\n" +
        "Диск: " + pc.getHardDrive() + "\n" +
        "Оперативна память: " + pc.getRAM() + "\n" +
        "Система охолодження: " + pc.getCooling()+"\n"+
        "Звукова карта:"+pc.getSoundCard());
  }
 
}

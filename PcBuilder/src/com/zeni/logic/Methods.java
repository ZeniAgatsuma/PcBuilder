package com.zeni.logic;

import com.zeni.model.SoundCard;
import com.zeni.ui.DetailSelection;
import java.util.Scanner;

public class Methods {
  public static <T> T selectAndDisplayComponent(T[] components, boolean displayDetails) {
    return DetailSelection.displayPCDetails(components, displayDetails);
  }
  public static SoundCard promptUserForSoundCard() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Оберіть опцію для звукової карти:");
    System.out.println("1. З звуковою картою");
    System.out.println("2. Без звукової карти");
    
    int userChoice = scanner.nextInt();
    if (userChoice == 1) {
      return selectAndDisplayComponent(SoundCard.SoundCardsCreate(), true);
    } else if (userChoice == 2) {
      
      System.out.println("Звукова карта не обрана (без звукової карти).");
      return null ;
    } else {
      System.out.println("Невірний вибір. Оберіть 1 або 2.");
      return null;
    }
  }
}

package com.company;

import java.util.Scanner;

public class LoadPreviousState{
   LoadPreviousState() {
      /* System.out.println("Do you have a character you want to load?");
       Scanner wannaLoadReader = new Scanner(System.in);
       String wannaLoad = wannaLoadReader.next();*/
      String wannaLoad = InputScanner.inputScanner("Do you have a character you want to load?");
       if ("yes".equals(wannaLoad)|| "Yes".equals(wannaLoad)) { //|| !"Yes".equals(wannaLoad
           String existingChampName = InputScanner.inputScanner("What is the name of the character you want to load?");
           /*Scanner champToLoadReader = new Scanner(System.in);
           String existingChampName = champToLoadReader.next();
           champToLoadReader.close();*/
           String loadableChampName = new DBUpdaters().checkForExistingChamp(existingChampName);
           if (loadableChampName == existingChampName) {
               System.out.println("We'll try to load " + loadableChampName);
               new DBUpdaters().loadExistingChamp(loadableChampName);
               Main.previousCharLoaded = true;
           } else {
               System.out.println(loadableChampName + " Doesn't seem to exist");
           }
       } else {
           System.out.println("We won't load a champ, create a new one");
           return;
       }
   }
}

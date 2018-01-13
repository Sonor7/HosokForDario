package com.company;

import java.util.Scanner;

public class InputScanner {
    public static String inputScanner(String flavourText){
        System.out.println(flavourText);
        Scanner scanner = new Scanner(System.in);
        String toReturn = scanner.nextLine();
        return toReturn;
    }
}

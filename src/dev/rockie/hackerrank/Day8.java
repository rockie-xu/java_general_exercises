package dev.rockie.hackerrank;

import java.io.*;
import java.util.*;

public class Day8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int listLength = scanner.nextInt();
        Map<String, String> phoneList = new HashMap<>(listLength);
        
        scanner.nextLine();
        
        String name = "";
        String number = "";
        for(int i=0; i<listLength; i++) {
            name = scanner.next();
            number = scanner.next();
            scanner.nextLine();
            
            phoneList.put(name, number);
        }
        
        while(scanner.hasNext()) {
            String nameToFine = scanner.nextLine().trim();
            if(phoneList.containsKey(nameToFine)) {
                System.out.println(nameToFine);
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}

class Day81 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInt = scanner.nextInt();
        double numDouble = scanner.nextDouble();
//        scanner.nextLine();
        String text = scanner.nextLine();
        scanner.close();
        System.out.println(String.format("first: %s, second: %s, third: %s", numInt, numDouble, text));
    }
}
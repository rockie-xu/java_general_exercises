package dev.rockie.hackerrank;

import java.io.*;
import java.util.*;

public class Day12 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int idNumber = scanner.nextInt();
        scanner.nextLine();
        
        int testScores = scanner.nextInt();
        scanner.nextLine();
        
        int[] scores = new int[testScores];
        for(int i=0; i<testScores; i++) {
            scores[i] = scanner.nextInt();
        }
        
        Student student = new Student(firstName, lastName, idNumber, scores);
        student.calculate();

        scanner.close();
    }
}

class Person {
    String firstName;
    String lastName;
    int idNumber;
    int[] scores;
    
    public Person(String firstName, String lastName, int idNumber, int[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.scores = scores;
    }
}

class Student extends Person {
    
    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber, scores);
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
    
    public char calculate() {
        int average = calculateAverage();
        char letter = 'a';
        if(90 <= average && average <= 100) letter = 'O';
        else if(80 <= average && average < 90) letter = 'E';
        else if(70 <= average && average < 80) letter = 'A';
        else if(55 <= average && average < 70) letter = 'P';
        else if(40 <= average && average < 55) letter = 'D';
        else {
            letter = 'T';
        }

        return letter;
    }

    private int calculateAverage() {
        return Arrays.stream(this.scores).sum() / this.scores.length;
    }
}

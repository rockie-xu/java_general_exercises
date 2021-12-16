package dev.rockie.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int maxLength = 1;

        String wholeString = Integer.toBinaryString(n);
        String[] arr = wholeString.split("");
        System.out.println(wholeString);

        boolean isOne = false;
        int tempMax = 1;
        for(String elem: arr) {
            if(elem.equals("1") && isOne) {
                tempMax++;
            }
            else if(elem.equals("1")) {
                isOne = true;
            }
            else {
                isOne = false;

                if(tempMax > maxLength) {
                    maxLength = tempMax;
                }

                tempMax = 1;
            }
        }
        if(tempMax > maxLength) {
            maxLength = tempMax;
        }

        return maxLength;
    }
}


package dev.rockie.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String S = bufferedReader.readLine();
            System.out.println(Integer.parseInt(S));
        } catch (IOException | NumberFormatException e) {
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }

}

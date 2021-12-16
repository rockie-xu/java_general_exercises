package dev.rockie.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

public class Day11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        System.out.println(countSum(arr));
    }

    public static int countSum(List<List<Integer>> arr) {
        int temp;

        int[] intList = new int[16];
        int counter = 0;
        for(int i=0; i<arr.size()-2; i++) {
            for(int c=0; c<arr.get(0).size()-2; c++) {
                temp = arr.get(i).get(c) + arr.get(i).get(c+1) + arr.get(i).get(c+2);
                temp += arr.get(i+1).get(c+1);
                temp += arr.get(i+2).get(c) + arr.get(i+2).get(c+1) + arr.get(i+2).get(c+2);

                intList[counter] = temp;
                counter++;
            }

        }
        Arrays.sort(intList);

        return intList[15];
    }
}

package dev.rockie.codility.lesson1;

import java.util.ArrayList;

public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap solution = new BinaryGap();
        System.out.println("binary gap of " + 25 + " is: " + solution.solution(25)); // should be 2
        System.out.println("binary gap of " + 1041 + " is: " + solution.solution(1041)); // should be 5
        System.out.println("binary gap of " + 32 + " is: " + solution.solution(32)); // should be 0
    }

    public BinaryGap() {
    }

    public int solution(int decimal) {

        ArrayList<Integer> binary = getBinary(decimal);
        ArrayList<Integer> indexesOfOne = getIndexesOfOne(binary);

        if(indexesOfOne.size() < 2) {
            return 0;
        } else {
            return getMaxBinaryGap(indexesOfOne);
        }
    }

    private int getMaxBinaryGap(ArrayList<Integer> indexesOfOne) {
        int maxGap = 0;
        for(int i=0; i<indexesOfOne.size()-1; i++) {
            int temp = indexesOfOne.get(i+1) - indexesOfOne.get(i) - 1;
            if(temp > maxGap) maxGap = temp;
        }

        return maxGap;
    }

    private ArrayList<Integer> getBinary(int decimal) {
        ArrayList<Integer> binary = new ArrayList<>();

        while(decimal > 0){
            binary.add(decimal%2);
            decimal = decimal/2;
        }

        System.out.println(binary);
        return binary;
    }

    private ArrayList<Integer> getIndexesOfOne(ArrayList<Integer> binary) {
        ArrayList<Integer> indexesOfOne = new ArrayList<>();

        for(int i=0; i<binary.size(); i++) {
            if(binary.get(i) == 1) {
                indexesOfOne.add(i);
            }
        }
        return indexesOfOne;
    }

}

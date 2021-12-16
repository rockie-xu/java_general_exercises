package dev.rockie;

import java.util.HashMap;

public class Solution5 {

    public static void main(String[] args) {
        Solution5 solution = new Solution5();
//        System.out.println(solution.solution(new int[] {3,8,2,3,3,2}));
        System.out.println(solution.solution(new int[] {7,1,2,8,2}));
    }

    public Solution5() {
    }

    public int solution(int[] A) {
        HashMap<Integer, Integer> valuesMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            int valueToCheck = A[i];
            if(valuesMap.containsKey(valueToCheck)) {
                valuesMap.put(valueToCheck, valuesMap.get(valueToCheck)+1);
            } else {
                valuesMap.put(valueToCheck, 1);
            }
        }

        int max = 0;

        for(Integer i : valuesMap.keySet()) {
            if(i == valuesMap.get(i)) {
                if(i > max) {
                    max = i;
                }
            }
        }

        return max;
    }


}

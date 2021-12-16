package dev.rockie;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(Arrays.toString(solution.solution(new int[]{3, 8, 9, 7, 6}, 3)));
    }

    public Solution2() {
    }

    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        int[] temp = A;
        for(int i=0; i<K; i++) {
            result = rotateOnce(temp);
            temp = result;
        }
        return result;
    }

    private int[] rotateOnce(int[] A) {

        int[] rotated = Arrays.copyOf(A, A.length);
        rotated[0] = A[A.length-1];

        for(int i=0; i<A.length-1; i++) {
            rotated[i+1] = A[i];
        }
        return rotated;
    }

}

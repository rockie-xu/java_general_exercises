package dev.rockie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        System.out.println(solution.solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution.solution(new int[]{-1, -3}));
    }

    public Solution3() {
    }

    public int solution(int[] A) {
//        List<Integer> list = new ArrayList<>();
//        for(int i=0; i<A.length; i++) {
//            list.add(A[i]);
//        }

        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());

//        List<Integer> list = Arrays.asList(A);

        Integer maxVal = Collections.max(list);
        Integer minVal = Collections.min(list);

        if(maxVal < 0 || minVal > 1) {
            return 1;
        }

        for(int i = minVal; 0<100000; i++) {
            if(!list.contains(i)) {
                return i;
            }
        }
    }

}

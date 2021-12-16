package dev.rockie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution8 {

    public static void main(String[] args) {
        Solution8 solution = new Solution8();
//        System.out.println(solution.solution(new int[]{2, 7, 11, 15}, 9));
        System.out.println(Arrays.toString(solution.solution(new int[]{2, 7, 11, 15}, 9)));
    }

    public Solution8() {
    }

    public int[] solution(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();


        for(int i=0; i<nums.length; i++) {

            map.put(i, nums[i]);


//            int check = target - nums[i];

//            for(int j=i+1; j<nums.length; j++) {
//                if(nums[i]+nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
        }

        map.forEach((i, j) -> {
            if(nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
//                break;
            }
        });

        return result;
    }


}

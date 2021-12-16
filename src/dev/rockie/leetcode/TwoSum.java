package dev.rockie.leetcode;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    */

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        boolean found = false;

        for(int first = 0; first < nums.length - 1; first++) {

            for(int second = first+1; second < nums.length; second++) {

                if((nums[first] + nums[second]) == target) {
                    result[0] = first;
                    result[1] = second;

                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        return result;
    }
}

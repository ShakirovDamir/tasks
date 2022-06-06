package leet_code;

import java.util.HashMap;
import java.util.Map;
/**
   *      Given an array of integers num and an integer target, return indices of the two numbers such that they add up to target.
   *      You may assume that each input would have exactly one solution, and you may not use the same element twice.
   *      You can return the answer in any order.
*/


public class TwoSum_1 {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        for (int i = 0; i < (new Solutions().twoSum(nums, target)).length; i++) {
            System.out.println(i);
        }
    }
}
class Solutions {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i= 0; i < nums.length; i++){
            int requiredNumber = target - nums[i];
            if(map.containsKey(requiredNumber) && map.get(requiredNumber) != i){
                return new int[]{i, map.get(requiredNumber)};
            }
        }
        throw new IllegalArgumentException();
    }
}

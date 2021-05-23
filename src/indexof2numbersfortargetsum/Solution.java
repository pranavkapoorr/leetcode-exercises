package indexof2numbersfortargetsum;

import java.util.*;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/

public class Solution {
	
	public int[] twoSum(int[] nums, int target) {
		System.out.println("loop method..time complexity o(n)sq but space complexity o(1)");
        for(int i = 0; i< nums.length; i++){
        	for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target) {
                	return new int[] {i,j};
                }
            }
         }
        
        throw new IllegalArgumentException("wrong data!");
    }
	public int[] twoSum1(int[] nums, int target) {
		System.out.println("2hash-HashMap method..time complexity o(n) but space complexity o(n)");
        Map<Integer,Integer> values = new HashMap<Integer,Integer>();
        for(int i = 0; i< nums.length; i++){
            values.put(nums[i],i);
            }
        for(int i = 0; i < nums.length; i++){
            if(values.containsKey(target-nums[i]) &&  values.get(target - nums[i]) != i){
                return new int[] {i,values.get(target-nums[i])};
            }
        }
        throw new IllegalArgumentException("wrong data!");
    }
	public int[] twoSum2(int[] nums, int target) {
		System.out.println("1hash-HashMap method..time complexity o(n) but space complexity o(n)");
        Map<Integer,Integer> values = new HashMap<Integer,Integer>();
        for(int i = 0; i< nums.length; i++){
        	if(values.containsKey(target-nums[i]) &&  values.get(target - nums[i]) != i){
                return new int[] {i,values.get(target-nums[i])};
            }
            values.put(nums[i],i);
            }
        throw new IllegalArgumentException("wrong data!");
    }
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,7,2,11,15};
		int target = 9;
		System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
		System.out.println(Arrays.toString(new Solution().twoSum1(nums, target)));
		System.out.println(Arrays.toString(new Solution().twoSum2(nums, target)));
	}

}

/*
 * 219. Contains Duplicate II
 * Given an integer array nums and an integer k,
 * return true if there are two distinct 
 * indices i and j in the array such that 
 * nums[i] == nums[j] and abs(i - j) <= k. 
*/

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> index = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!index.containsKey(nums[i])) {
                index.put(nums[i], i);
            } else {
                if(i - index.get(nums[i]) <= k) {
                    return true;
                }
                else {
                    index.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
/**
 * Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * Difficulty: Easy
 * Approach: Two Pointer
 * Author: Yash Yadav
 * Date: 12
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int wp = 1;
        for(int rp = 1; rp < nums.length; rp++){
            if(nums[rp]==nums[rp-1]){
                continue;
            }
            else{
                nums[wp] = nums[rp];
                wp++;
            }
        }
        return wp++;
    }
}
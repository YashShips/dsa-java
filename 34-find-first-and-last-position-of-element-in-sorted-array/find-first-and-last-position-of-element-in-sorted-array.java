class Solution {
    public void helper(int[] nums, int target, int idx, int[] result){
        if(idx == nums.length) return;
        if(nums[idx] == target){
            if(result[0] == -1) result[0] = idx;
            result[1] = idx;
        }
        helper(nums, target, idx + 1, result);
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1 , -1};
        helper(nums, target, 0, result);
        return result;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int sum = 0,
        min = Integer.MAX_VALUE,
        i = 0,
        j = 0;

        while(j < nums.length){
            sum = sum + nums[j];
            while(sum >= target){
                sum = sum - nums[i];
                min = Math.min(min, j - i + 1);
                i++;
            }
            j++;
        }

        return min == Integer.MAX_VALUE ? 0 : min;  
    }
}
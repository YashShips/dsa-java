class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int sum = 0,
         min = Integer.MAX_VALUE;

    int i = 0,
        j = 0;

    while( j < nums.length ){
        sum = sum + nums[j];
        while(sum >= target){
            min = Math.min(j - i + 1, min);
            sum = sum - nums[i];
            i++;
        }
            j++;
    }
    return min == Integer.MAX_VALUE ? 0 : min;
    }
}
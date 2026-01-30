class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int rSum = 0;
        int aSum = 0;
        for(int i = 0; i <= n; i++){
            rSum += i;
        }
        for(int num : nums){
            aSum += num;
        }

        return rSum - aSum;
    }
}
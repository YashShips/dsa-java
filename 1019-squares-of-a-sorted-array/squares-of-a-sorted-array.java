class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1, k = nums.length - 1;
        int[] sq = new int[nums.length]; 
        while(i <= j){
            if(Math.abs(nums[i]) >= Math.abs(nums[j])){
                sq[k] = nums[i] * nums[i];
                i++;
            }
            else{
                sq[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return sq;
    }
}
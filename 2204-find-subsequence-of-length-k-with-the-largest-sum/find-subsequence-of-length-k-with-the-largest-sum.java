class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] numsDetails = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            numsDetails[i][0] = nums[i];
            numsDetails[i][1] = i;
        }
        Arrays.sort(numsDetails, (a, b) -> b[0] - a[0]);
        Arrays.sort(numsDetails, 0, k, (a, b) -> a[1] - b[1]);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = numsDetails[i][0];
        }
        return res;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int a = 0,
            b = nums.length - 1,
            k = nums.length - 1;
        int res[] = new int[nums.length];
        while(a <= b){
            if(Math.abs(nums[a]) >= Math.abs(nums[b])){
                res[k] = nums[a] * nums[a];
                a++;
            }
            else{
                res[k] = nums[b] * nums[b];
                b--;
            }
            k--;
        } 
        return res;
    }
}
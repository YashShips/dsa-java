class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int a = 0,
            b = n;
        for(int i = 0; i < 2*n; i += 2){
            arr[i] = nums[a];
            arr[i + 1] = nums[b];
            a++;
            b++;
        }
        return arr;
    }
}
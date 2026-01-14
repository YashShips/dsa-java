class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        int b=0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == 0){
        //         a = i;
        //         break;
        //     }
        // }
        // int b = a + 1;
        while( b < nums.length ){
            if( nums[b] != 0 ){
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
            }
            b++;
        }
    }
}
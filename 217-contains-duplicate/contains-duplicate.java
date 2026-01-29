class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        int b = a + 1;
        while( b < nums.length ){
            if( nums[a] != nums[b] ){
                a++;
                b++;
            }
            else if ( nums[a] == nums[b] ) return true;
        }

        return false;
    }
}
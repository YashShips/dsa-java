class Solution {
    public int countPairs(List<Integer> nums, int target) {
        /**
        1. Sort 
        2. converging pointer checking between a range, takes all the values in between as the pointer refers to largest sum, so all the sums in between will automatically be a pair that meets the condition.
         */
        Collections.sort(nums);
        int i = 0, j = nums.size() - 1, count = 0;
        while( i < j ){
            int sum = nums.get(i) + nums.get(j);
            if(sum < target){
                count = count + ( j - i );
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}
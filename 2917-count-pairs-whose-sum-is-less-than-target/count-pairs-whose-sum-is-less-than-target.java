class Solution {
    public int countPairs(List<Integer> nums, int target) {
        /**
        1. Sort 
        2. converging pointer checking between a range, takes all the values in between as the pointer refers to largest sum, so all the sums in between will automatically be a pair that meets the condition.
         */
        Collections.sort(nums);
        int a = 0, b = nums.size() - 1, count = 0;
        while( a < b ){
            int sum = nums.get(a) + nums.get(b);
            if( sum < target ){
                count = count + ( b - a );
                a++;
            }
            else{
                b--;
            }
        }
        return count;
    }
}
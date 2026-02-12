class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int a = 0, b = nums.size() - 1;
        int count = 0;
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
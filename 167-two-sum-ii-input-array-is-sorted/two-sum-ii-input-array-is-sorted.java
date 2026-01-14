class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int a = 0;
         int b = numbers.length - 1;
         while( a < b ){
            int sum = numbers[a] + numbers[b];
            if( sum == target ){
                return new int[]{a + 1, b + 1};
            }
            else if( sum > target ){
                sum = 0;
                b--;
            }
            else if( sum < target ){
                sum = 0;
                a++;
            }
         }
         return new int[]{0,0};
    }
}
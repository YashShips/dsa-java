class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int a = 0, b = numbers.length - 1;
       while(a < b){
        int sum = numbers[a] + numbers[b];
        if(sum == target) return new int[]{a + 1, b+1};
        else if(sum > target){
            b--;
            sum = 0;
        }
        else{
            a++;
            sum = 0;
        }
       }
       return new int[]{0,0};
    }
}
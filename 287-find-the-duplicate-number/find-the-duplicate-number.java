class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0,
            slow = 0;
        
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(fast != slow);
        int n1 = 0,
            n2 = fast;
        while(n1 != n2){
            n1 = nums[n1];
            n2 = nums[n2];
        }
        return n2;
    }
}
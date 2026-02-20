class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0,
            fast = 0;
        do{
            slow = nums[slow];
            // fast = nums[fast];
            // fast = nums[fast];  isko agar shortcut m likhna h toh hum likhenge
            fast = nums[nums[fast]];
        }
        while(slow != fast);

        int n1 = 0,
            n2 = slow;

        while(n1 != n2){
            n1 = nums[n1];
            n2 = nums[n2];
        }
        return n2;
    }
}
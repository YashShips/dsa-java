class Solution {
    public int firstOcc(int[] nums, int target){
        int high = nums.length - 1, low = 0;
        int ans = -1;
        while(high >= low){
            int mid = low + (high - low)/ 2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
            return ans;
    }
    public int secOcc(int[] nums, int target){
        int high = nums.length - 1, low = 0;
        int ans = -1;
        while(high >= low){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstOcc(nums, target);
        int last = secOcc(nums, target);
        return new int[] {first, last};
    }
}
class Solution {
    public void helper(int first, int[] nums, List<List<Integer>> res){
        int i = first + 1, j = nums.length - 1;
        while( i < j ){
            int sum = nums[first] + nums[i] + nums[j];
            if(sum > 0){
                j--;
            }
            else if(sum < 0){
                i++;
            }
            else{
                res.add(Arrays.asList(nums[first], nums[i], nums[j]));
                i++;
                j--;
            while(i<j && nums[i] == nums[i - 1]) i++;
            while(i<j && nums[j] == nums[j + 1]) j--;
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int first = 0; first < nums.length; first++){
            if(nums[first] > 0) break;
            else if(first == 0 || nums[first] != nums[first - 1]){
                helper(first, nums, res);
            }
        }
            return res;
    }
}
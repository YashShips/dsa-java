class Solution {
    public void helper(int f, int[] nums, List<List<Integer>> res){
        int a = f + 1, b = nums.length - 1;
        while( a < b ){
            int sum = nums[f] + nums[a] + nums[b];
            if(sum > 0) b--;
            else if(sum < 0) a++;
            else{
                res.add(Arrays.asList(nums[f], nums[a], nums[b]));
                a++;
                b--;
                while(a < b && nums[a] == nums[a - 1]) a++;
                while(a < b && nums[b] == nums[b + 1]) b--;
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> res = new ArrayList<>();
       for(int i = 0; i < nums.length; i++){
        if(nums[i] > 0) break;
        else if(i == 0 || nums[i] != nums[i - 1]){
            helper(i, nums, res);
        }
       }
       return res;
    }
}
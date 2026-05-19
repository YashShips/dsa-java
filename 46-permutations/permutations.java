class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        cb(0, nums, res);
        return res;
    }
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void cb(int idx, int[] nums, List<List<Integer>> res){
        if(nums.length == idx){
            List<Integer> db = new ArrayList<>();
            for(int num : nums){
                db.add(num);
            }
            res.add(db);
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(nums, idx, i);
            cb(idx + 1, nums, res);
            swap(nums, idx, i);
        }
    }
}
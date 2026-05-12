class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        cb(0, nums, res, new ArrayList<>());
        return res;
    }
    public void cb(int idx, int[] nums, List<List<Integer>> res, List<Integer> ds){
        res.add(new ArrayList<>(ds));
        for(int i = idx; i < nums.length; i++){
            if(i != idx && nums[i - 1] == nums[i]) continue;
            ds.add(nums[i]);
            cb(i + 1, nums, res, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
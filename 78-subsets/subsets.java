class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        cb(0, nums, res, new ArrayList<>());
        return res;
    }
    public void cb(int idx, int[] nums, List<List<Integer>> res, List<Integer> ds){
            res.add(new ArrayList<>(ds));
        for(int i = idx; i < nums.length; i++){
            ds.add(nums[i]);
            cb(i + 1, nums, res, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
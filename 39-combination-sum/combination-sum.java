class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        cb(0, candidates, target, res, new ArrayList<>());
        return res;
    }
    public void cb(int idx, int[] arr, int target, List<List<Integer>> res, List<Integer> ds){
        if(idx == arr.length){
            if(target == 0){
                res.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx] <= target){
            ds.add(arr[idx]);
            cb(idx, arr, target - arr[idx], res, ds);
            ds.remove(ds.size() - 1);
        }
        cb(idx + 1, arr, target, res, ds);
    }
}
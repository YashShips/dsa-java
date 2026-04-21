class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        cb(0, candidates, target, res, new ArrayList<>());
        return res;
    }
    public void cb(int idx, int[] arr, int target, List<List<Integer>> res, List<Integer> ds){
        if(target == 0){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx; i < arr.length; i++){
            if(arr[i] > target) continue;
            ds.add(arr[i]);
            cb(i, arr, target - arr[i], res, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
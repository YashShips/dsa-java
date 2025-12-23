class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subseq(nums, 0, new ArrayList<>(), result);
        return result;
    }
    public void subseq(int[] nums, int index, List<Integer> current, List<List<Integer>> result){
        if ( index == nums.length ){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        subseq(nums, index + 1, current, result);
        current.remove(current.size() - 1);
        subseq(nums, index + 1, current, result);
    }
}
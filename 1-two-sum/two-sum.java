class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>(); 
       int comp = 0;
       for(int i = 0 ; i < nums.length ; i++){
            comp = target - nums[i];
            if(map.containsKey(comp)){
                int a = map.get(comp);
                return new int[]{a, i};
            }
            else{
                map.put(nums[i], i);
            }
       }
       return new int[]{0,0};
    }
}
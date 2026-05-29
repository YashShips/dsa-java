class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix = 0;
        int cnt = 0;
        for(int num : nums){
            prefix += num % 2;
            if(map.containsKey(prefix - k)) cnt += map.get(prefix - k);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return cnt;
    }
}
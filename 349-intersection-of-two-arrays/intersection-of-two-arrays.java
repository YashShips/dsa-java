class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, 1);
        }
        List<Integer> res = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) == 1){
                res.add(num);
                map.put(num, 0);
            }
        }
        int[] arr = new int[res.size()];
        int i = 0;
        for(int num : res){
            arr[i++] = num;
        }
        return arr;
    }
}
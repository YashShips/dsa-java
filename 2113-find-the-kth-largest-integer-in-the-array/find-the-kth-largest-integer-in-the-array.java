class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> minHeap = new PriorityQueue<>((a,b) -> {
            if(a.length() == b.length()) return a.compareTo(b);
            else return a.length() - b.length();
        });
        for(int i = 0; i < nums.length; i++){
            minHeap.offer(nums[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
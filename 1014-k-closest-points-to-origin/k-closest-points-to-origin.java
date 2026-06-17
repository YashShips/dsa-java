class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //A priority queue based on the distance formula that too a maxHeap, as we needed the least value
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a , b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );
        //Building our maxHeap
        for(int[] point : points){
            maxHeap.offer(point);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        //Making a 2D array to store our answer
        int[][] ans = new int[k][2];
        //Using our maxHeap filling our ans array
        for(int i = k - 1; i >= 0; i--){
            ans[i] = maxHeap.poll();
        }
        return ans;
    }
}
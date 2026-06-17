class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));
        int[][] ans = new int[k][2];
        for(int i = k - 1; i >= 0; i--){
            ans[i] = points[i];
        }
        return ans;
    }
}
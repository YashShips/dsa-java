class Solution {
    public int maxArea(int[] height) {
        int a = 0;
        int b = height.length - 1;
        int maxA = Integer.MIN_VALUE;
        while( a < b ){
            int l = Math.min(height[a], height[b]);
            int w = b - a;
            int area = l * w;
            if( area > maxA ){
                maxA = area;
            }
            if( height[a] < height[b] ){
                a++;
            }
            else{
                b--;
            }
        }
        return maxA;
    }
}
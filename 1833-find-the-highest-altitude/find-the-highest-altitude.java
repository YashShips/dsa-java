class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int left = 0;
        for(int i = 0; i < gain.length; i++){
            left += gain[i];
            max = Math.max(max, left);
        }
        return max;
    }
}
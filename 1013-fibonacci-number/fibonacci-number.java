class Solution {
    public static int[] dp = new int[31];
    static{
        Arrays.fill(dp, -1);
    }
    public int fib(int n) {
        if( n <= 1) return n;
        int a, b;
        if(dp[n - 1] != -1) a = dp[n - 1];
        else a = fib(n - 1);
        if(dp[n - 2] != -1) b = dp[n - 2];
        else b = fib(n - 2);
        return dp[n] = a + b;
    }
}
class Solution {
    int[] dp;
    public int solve(int n){
        if(n == 0 || n ==1) return 1;
        if(dp[n] != -1) return dp[n];
        int single = solve(n-1);
        int dou = solve(n-2);
        return dp[n]= single + dou;
    }
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
    }
}

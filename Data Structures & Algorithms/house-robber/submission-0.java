class Solution {
    static int[] dp;
    public int solve(int i,int[] nums){
        if( i > nums.length-1) return 0;
        if(dp[i] != -1) return dp[i];
        int skip = solve(i+1,nums);
        int take = nums[i] + solve(i+2,nums);

        return dp[i] = Math.max(skip,take);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,nums);
    }
}

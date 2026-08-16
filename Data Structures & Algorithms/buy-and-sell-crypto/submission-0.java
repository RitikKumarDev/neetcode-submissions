class Solution {
    static int[][][] dp;
    public int solve(int i,int buy,int cap, int[] pri){
        if(i == pri.length || cap ==0) return 0;
        if(dp[i][buy][cap]!= -1) return dp[i][buy][cap];
        int take =0;
        int skip =0;
        if(buy == 0){
            take = -pri[i] + solve(i+1,1,cap,pri);
            skip = solve(i+1,0,cap,pri);
        }else{
            take = pri[i] + solve(i+1,0,cap-1,pri);
            skip = solve(i+1,1,cap,pri);
        }
        return dp[i][buy][cap] = Math.max(take,skip);
    }
    public int maxProfit(int[] pri) {
        int buy=0;
        int cap =1;
        int n   = pri.length;
        dp = new int[n+1][2][cap+1];
        for(int i=0;i<n;i++){
            for(int j =0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(0,0,cap,pri);
        
    }
}

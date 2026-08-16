class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
       
        int ans = Integer.MIN_VALUE;
        int best = 0;
        for(int i=0;i<n;i++){
            int v1 = best + nums[i];
            int v2 = nums[i];
            best = Math.max(v1,v2);
            ans = Math.max(ans,best);
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}

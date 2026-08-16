class Solution {
    public int maxArea(int[] heights) {
        int i =0;
        int ans =0;
        int j = heights.length-1;
        while(i < j){
            int base = j-i;
            int hei = Math.min(heights[i],heights[j]);
            int area=  hei * base;
            ans = Math.max(ans, area); 
            if(heights[i] > heights[j]){
                j--;
            }else{
                i++;
            }
            
        }
        return ans;
        
    }
}

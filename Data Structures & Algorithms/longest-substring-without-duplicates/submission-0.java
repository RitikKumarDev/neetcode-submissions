class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int low = 0;
        int ans =0;
        int n = s.length();
        for(int high =0;high <n;high++){
            char ch= s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch) > 1){
                char th = s.charAt(low);
                map.put(th,map.getOrDefault(th,0)-1);
                if(map.get(th) ==0){
                    map.remove(th);
                }
                low++;
            }
            int len = high -low+1;
            ans = Math.max(ans,len);
        }
        return ans;
    }
}

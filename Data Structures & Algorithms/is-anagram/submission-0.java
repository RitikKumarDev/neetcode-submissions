class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
       
        int n = s.length();
        int m = t.length();
        if(n != m) return false;

        for(int i=0;i<n;i++){
            char sh = s.charAt(i);
            char th = t.charAt(i);

            map.put(sh,map.getOrDefault(sh,0)+1);
            map.put(th,map.getOrDefault(th,0)-1);
        }
        int l = map.size();
        for(int i=0;i<l;i++){
            char sh = s.charAt(i);
            if(map.get(sh) != 0){
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> map = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
           
            int s = -1 * nums[i];

            while(left < right){
                 int sum = nums[left] + nums[right];
               

                if(sum == s){
                    map.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(right > left && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(sum > s){
                    right--;
                }else{
                    left++;
                }
               
            }
        }
        return map;
        
    }
}

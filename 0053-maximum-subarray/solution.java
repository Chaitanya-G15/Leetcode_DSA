class Solution {
    public int maxSubArray(int[] nums) {
         int cs = 0;
         int ans  = Integer.MIN_VALUE;  
         for(int i = 0; i<nums.length;i++){
            cs = nums[i] + cs;
            ans = Math.max(ans,cs);
            if(cs<0)cs=0;
         }
         return ans;
        }
}

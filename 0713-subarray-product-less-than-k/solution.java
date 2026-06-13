class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int prod = 1 , l = 0 , count = 0;

        if(k == 0) return 0;

        for(int r =0;r<nums.length;r++){
            prod *= nums[r];
            while(l <= r && prod >= k){
                prod /= nums[l++];
            }
            count += r - l + 1;
        }
        return count;
    }
}

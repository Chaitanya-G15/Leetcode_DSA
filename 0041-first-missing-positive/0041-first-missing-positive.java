class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n;i++){
            // element should be betn 1-n and no duplicate 
            while(nums[i] >= 1 && nums[i] <=n && nums[nums[i] - 1] != nums[i]){
                // swap the elements with the element at expected position
                int swap = nums[i];
                int idx = swap - 1;
                nums[i] = nums[idx];
                nums[idx] = swap;
            }
        }
        // Check for the missing element 
        for (int i = 0; i < n; i++) {
            if(nums[i] != i+1){
                return i + 1;
            }
        }
        return n + 1;
    }
}
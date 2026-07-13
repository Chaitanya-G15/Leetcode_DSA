class Solution {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            // XOR everything
            diff ^= num;
        }
        // Get its last set bit where a and b differ
        diff &= -diff;
        
        // Pass 2 :
        int[] ans = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums)
        {
            if ((num & diff) == 0)   // group A
            {
                ans[0] ^= num;
            }
            else // group B
            {
                ans[1] ^= num;
            }
        }
        return ans;
    }
}
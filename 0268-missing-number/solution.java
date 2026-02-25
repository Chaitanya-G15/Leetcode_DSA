class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int e = 0;

        while(n != 0){
            sum += n;
            n--;
        }

        int sum_ = 0;

        for(int i=0;i<nums.length;i++){
            sum_ += nums[i];
        }

        e = sum - sum_;
        return e;


    }
}

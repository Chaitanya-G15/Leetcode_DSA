class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sq = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int index = sq.length - 1;
        while(index >= 0){
            if(nums[start] * nums[start] < nums[end] * nums[end]){
                sq[index] = nums[end] * nums[end];
                index--;
                end--;
            }
            else{
                sq[index] = nums[start] * nums[start];
                index--;
                start++;
            }
        }
        return sq;
    }
}

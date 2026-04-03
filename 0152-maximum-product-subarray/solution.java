class Solution {
    public int maxProduct(int[] nums) {
        int maxPro = nums[0];
        int minPro = nums[0];
        int result = nums[0];


        for(int i=1;i<nums.length;i++){
            int curr = nums[i];

            if(curr < 0){
                int temp = maxPro;
                maxPro = minPro;
                minPro = temp;
            }

            maxPro = Math.max(curr,maxPro*curr);
            minPro = Math.min(curr,minPro*curr);

            result = Math.max(result,maxPro);
        }
        return result;
    }
}

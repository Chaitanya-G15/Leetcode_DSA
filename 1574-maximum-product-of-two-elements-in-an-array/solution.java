class Solution {
    public int maxProduct(int[] nums) {
       int max = 0;
       for(int i=0;i<nums.length-1;i++){
        int j = i+1;
        while(j<nums.length){
            int product = (nums[i]-1) * (nums[j]-1);
            if(product > max){
                max = product;
            }
            j++;
        }
       } 
       return max;
    }
}

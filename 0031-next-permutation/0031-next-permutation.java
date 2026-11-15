class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1 , ind2 = -1, n = nums.length;

        for(int i = n-2;i>=0;i--){
            if(nums[i] < nums[i+1]) { //find dip
                ind = i;
                break;
            } 
        }
        // No dip found
        if(ind == -1) { 
            reverse(nums,0);
        }
        else {
            for(int i= n-1;i>=0;i--){
                if(nums[i] > nums[ind]){
                    ind2 = i;
                    break;
                }
            }

            swap(nums , ind , ind2);
            reverse(nums, ind + 1);
        }
    }

    void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums , int start){
        int i= start;
        int j = nums.length - 1;

        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
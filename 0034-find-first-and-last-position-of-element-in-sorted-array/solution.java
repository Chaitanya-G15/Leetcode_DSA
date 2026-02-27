class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = {-1,-1};
        result[0] = binarySearch(nums,target,true);
        result[1] = binarySearch(nums,target,false);
        return result;
    }

    public int binarySearch(int[] nums, int target,boolean isLeft){
        int low = 0;
        int high = nums.length-1;
        int idx = -1;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(nums[mid] > target){
                    high = mid - 1;
                }
                else if(nums[mid] < target){
                    low = mid + 1;
                }
                else{
                    idx = mid;
                    if(isLeft){
                        high = mid - 1;
                    }
                    else{
                        low = mid + 1;
                    }
                }

            }
        return idx;
    }
}

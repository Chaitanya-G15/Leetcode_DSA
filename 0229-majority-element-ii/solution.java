class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1  = 0, count2 = 0;
        int p = 0, q = 0 , n = nums.length;

        for(int i=0;i<n;i++){
            if(count1 == 0 && nums[i] != q){
                count1 = 1;
                p = nums[i];
            }
            else if(count2 == 0 && nums[i] != p){
                count2 = 1;
                q = nums[i];
            }
            else if(p == nums[i]){
                count1++;
            }
            else if(q == nums[i]){
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        int threshold = n / 3;

        count1 = 0;
        count2 = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == p){
                count1++;

            }
            else if(nums[i] == q){
                count2++;
            }
        }
        if(count1 > threshold){
            res.add(p);
        }
        if(count2 > threshold){
            res.add(q);
        }
        return res;
    }
}

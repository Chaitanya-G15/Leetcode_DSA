class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> l = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            nums[index] = - Math.abs(nums[index]);
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j] > 0){
                l.add(j+1);
            }
        }
        return l;
    }
}

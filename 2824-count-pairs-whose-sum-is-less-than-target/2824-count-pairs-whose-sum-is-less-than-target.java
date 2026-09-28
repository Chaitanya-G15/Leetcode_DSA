class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0 , i = 0, j = nums.size() - 1;

        while(i < j){
            int sum = nums.get(i) + nums.get(j);
            if(sum < target){
                count += j - i;
                i++;
            }
            else {
                j--;
            }
        }
        return count;
    }
}
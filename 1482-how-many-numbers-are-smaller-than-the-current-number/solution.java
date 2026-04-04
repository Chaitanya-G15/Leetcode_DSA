class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n = nums.length;
        int sorted[] = nums.clone();
        Arrays.sort(sorted);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i],i);
            }
        }

        int ans[] = new int[nums.length];

        for(int i=0;i<n;i++){
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
}

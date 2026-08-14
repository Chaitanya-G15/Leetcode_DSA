class Solution {
    public int findLHS(int[] nums) {
        
        HashMap<Integer , Integer> freq = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i] , 0) + 1);
        }

        int maxlength = 0;
        for(int n : freq.keySet()){
            if(freq.containsKey(n + 1)){
                int len = freq.get(n) + freq.get(n+1);
                maxlength = Math.max(maxlength , len); 
            }
        }

        return maxlength;
    }
}
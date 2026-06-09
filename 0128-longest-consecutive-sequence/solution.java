class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longest = 1, len = nums.length;

        Set<Integer> set = new HashSet<>();

        if(len == 0) return 0;
        for(int i=0;i<len;i++){
            set.add(nums[i]);
        }

        for(int n : set){

            if(!set.contains(n - 1)){
                int count = 1;
                int x = n;

            while(set.contains(x+1)){
                x = x+1;
                count = count+1;
            }
            longest = Math.max(longest , count);
        }
        }

        return longest;
    }
}

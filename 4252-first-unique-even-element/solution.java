class Solution {
    public int firstUniqueEven(int[] nums) {

        int max = 0;

        for(int num : nums){
            max = Math.max(max, num);
        }

        int[] freq = new int[max + 1];

        for(int num : nums){
            freq[num]++;
        }

        for(int num : nums){
            if(num % 2 == 0 && freq[num] == 1){
                return num;
            }
        }

        return -1;
    }
}

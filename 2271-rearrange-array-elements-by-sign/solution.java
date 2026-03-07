class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i : nums){
            if(i > 0){
                a1.add(i);
            }
            else{
                a2.add(i);
            }
        }

        int ind1 = 0;
        int ind2 = 0;

        while (ind2 < nums.length / 2) {
            ans.add(a1.get(ind1));
            ind1++;
            ans.add(a2.get(ind2));
            ind2++;
        }
    
    return ans.stream().mapToInt(Integer::intValue).toArray();
}
}

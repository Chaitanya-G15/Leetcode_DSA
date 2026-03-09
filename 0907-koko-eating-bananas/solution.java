class Solution {

    public int findmax(int[] piles){
        int max = -1;
        for(int i : piles){
            max = Math.max(i , max);
        }
        return max;
    }

    public long findTotal(int[] piles , int k){
        long total = 0;

        for(int i = 0; i < piles.length; i++){
            total += (piles[i] + k - 1) / k;   // ceil division
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = findmax(piles);
        int ans = -1;

        while(i <= j){
            int mid = i + (j - i) / 2;

            long totalHours = findTotal(piles, mid);

            if(totalHours > h){
                i = mid + 1;
            }
            else{
                ans = mid;
                j = mid - 1;
            }
        }
        return ans;
    }
}

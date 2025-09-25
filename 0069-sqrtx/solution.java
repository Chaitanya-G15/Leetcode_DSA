class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        int result = 1;

        if(x == 0){
            return x;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;

            long sqr = (long)mid * mid;
            
            if(sqr <= x){
                result = mid;
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return result;
    }
}

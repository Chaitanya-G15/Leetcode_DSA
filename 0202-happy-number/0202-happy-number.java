class Solution {
    int SquareSum(int n){
        int sum = 0;
        while(n > 0){
            int digit  = n % 10;
            sum = sum + (digit*digit);
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n , fast = n;

        while(fast != 1){
            fast = SquareSum(SquareSum(fast));
            slow = SquareSum(slow);

            if(fast == 1){
                return true;
            }

            if(slow == fast){
                return false;
            }
        }

        return true;
        
    }
}
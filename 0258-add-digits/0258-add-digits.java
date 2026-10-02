class Solution {
    public int digitSum(int n){
        int sum = 0;
        while( n > 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        return sum;
    }
    public int addDigits(int num) {

        while(num / 10 > 0){
            num = digitSum(num);
        }

        return num;
    }
}
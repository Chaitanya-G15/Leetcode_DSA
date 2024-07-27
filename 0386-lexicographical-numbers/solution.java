class Solution {
    List<Integer> ans;
    public List<Integer> lexicalOrder(int n) {
        ans = new ArrayList<>();

        for(int i = 1; i <=9;i++){
            lexical(i,n);
        }
        return ans;
    }
    public void lexical(int sum,int n){
        if( sum > n){
            return;
        }
        ans.add(sum);
        sum = sum * 10;

        for(int i = 0; i<= 9;i++){
            lexical(sum+i,n);
        }
    }
}

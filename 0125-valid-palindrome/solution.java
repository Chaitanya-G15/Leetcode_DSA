class Solution {
    public boolean isPalindrome(String s) {
        String p = s.toLowerCase();
        p = p.replaceAll("[^a-z0-9]", "");

        int i = 0,j=p.length()-1;

        while(i <= j){
            if(p.charAt(i) != p.charAt(j)){
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;        
    }
}

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        HashSet<String> res = new HashSet<>();
        HashSet<String> set = new HashSet<>();
        int l = 0;
        String sub = "";
        for(int r = 10;r<=s.length();r++){
            sub = s.substring(l,r);
            if(!set.add(sub)){
                res.add(sub);
            }
            l++;
        }
        return new ArrayList(res);


    }
}

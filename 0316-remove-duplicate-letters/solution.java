class Solution {
    public String removeDuplicateLetters(String s) {
        
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] available = new boolean[26];
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(available[ch - 'a']){
                continue;
            }
            
            while(!stack.isEmpty() && stack.peek() > ch && lastIndex[stack.peek() - 'a'] > i){
                available[stack.peek() - 'a'] = false;
                stack.pop();
            }

            stack.push(ch);
            available[ch - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}

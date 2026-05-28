class Solution {
    public String removeDuplicates(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
           sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}

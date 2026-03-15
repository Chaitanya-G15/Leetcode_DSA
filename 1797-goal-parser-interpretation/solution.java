class Solution {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i) == 'G'){
                result.append('G');
            }
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                result.append('o');
                i++;
            }
            if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')'){
                result.append("al");
                i += 3;
            }
        }
        return result.toString();
    }
}

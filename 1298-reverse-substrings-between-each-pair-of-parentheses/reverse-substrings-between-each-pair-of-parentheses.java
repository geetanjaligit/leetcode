class Solution {
    public String reverseParentheses(String s) {
        Stack <StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(current);
                current = new StringBuilder();
            }
            else if (c==')'){
                StringBuilder reversed = current.reverse();
                current = stack.pop().append(reversed);
            }
            else{
                current.append(c);
            }
        }
        return current.toString(); 
    }
}
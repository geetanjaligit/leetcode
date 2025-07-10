class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            String ch=tokens[i];
            if (!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/"))
                st.push(Integer.parseInt(ch));
            else {
            int v2 = st.pop();
            int v1 = st.pop();
            if (ch.equals("+"))
                st.push(v1 + v2);
            else if (ch.equals("-"))
                st.push(v1 - v2);
            else if (ch.equals("*"))
                st.push(v1 * v2);
            else if (ch.equals("/"))
                st.push(v1 / v2);
            }
        }
        return st.peek();

    }
}

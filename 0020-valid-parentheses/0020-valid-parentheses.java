class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0 ; i<s.length() ; i++) {
            char c=s.charAt(i);
            // push
            if(c=='(' || c=='[' || c=='{') {
                st.push(c);
            }else if((c==')' && !st.empty() && st.peek()=='(') || 
            (c==']' && !st.empty() &&st.peek()=='[') || 
            (c=='}' && !st.empty() && st.peek()=='{')) {
                st.pop();
            }else {
                return false;
            }
        }

        return st.empty();
        
    }
}
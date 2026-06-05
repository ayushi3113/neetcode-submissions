class Solution {
    public boolean isValid(String s) {
        int i = 0;
        Stack<Character> st = new Stack<>();
        while(i<s.length()){
            if(st.isEmpty() || (s.charAt(i)== '(' || s.charAt(i)=='{' || s.charAt(i)=='[')){
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)== ')'){
                    if(st.peek()!='(') return false;
                }
                else if(s.charAt(i)==']'){
                    if(st.peek()!='[') return false;
                }
                else{
                    if(st.peek()!='{') return false;
                }
                st.pop();
            }
            i++;
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}

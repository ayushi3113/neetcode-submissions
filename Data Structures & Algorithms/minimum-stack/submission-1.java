class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> getMin = new Stack<>();
    public MinStack() {
        
    }
    public void push(int val) {
        st.push(val);
        if(getMin.isEmpty() || getMin.peek()>=val){
            getMin.push(val);
        }
    }
    public void pop() {
        if(!st.isEmpty()){
            int x = st.pop();
            if(getMin.peek()==x){
                getMin.pop();
            }
        }       
    }
    public int top() {
        return st.peek();
    }
    public int getMin() {
        return getMin.peek();   
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
       // logic is for each bar we will go left and right upto we dont get the bar shorter than  the curr
       // bar height 
       Stack<Integer> st = new Stack<>();
       int [] prev = new int[heights.length];
       int [] next = new int[heights.length];
       // for the left side
       for(int i=0;i<heights.length;i++){
            prev[i] = -1;
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(!st.isEmpty()) prev[i] = st.peek();
            st.push(i);
       }
       // for the right smaller
       st.clear();
        for(int i = heights.length-1;i>=0;i--){
            next[i] = heights.length;
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                next[i] = st.peek();
            }
            st.push(i);
        }
        int area = 0;
        for(int i = 0;i<heights.length;i++){
            area = Math.max(area,heights[i]*(next[i]-prev[i]-1));
        }
        return area;
    }
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int [][] ans = new int[speed.length][2];
        for(int i=0;i<speed.length;i++){
            ans[i][0] = position[i];
            ans[i][1] = speed[i];
        }
        Arrays.sort(ans,(a,b)->Integer.compare(a[0],b[0]));
        Stack<Double> st = new Stack<>();
        for(int i=speed.length-1;i>=0;i--){
            double time = (double)(target - ans[i][0])/ans[i][1];
            if(st.isEmpty() || st.peek()<time) st.push(time);
        }
        return st.size();
    }
}
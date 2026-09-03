class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] ans = new int[nums.length - k + 1];
        int idx = 0;
        int left = 0,right=0;
        Deque<Integer> st = new ArrayDeque<>();
        while(right<nums.length){
            while(!st.isEmpty() && nums[st.getLast()]<nums[right]){
                st.removeLast();
            }
            if(!st.isEmpty() && left>st.getFirst()){
                st.removeFirst();
            }
            st.addLast(right);
            if(right-left+1 ==k){
                ans[idx++] = nums[st.getFirst()];
                left++;
            }
            right++;
        }
        return ans;
    }
}
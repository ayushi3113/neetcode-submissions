class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0,right = 0;
        int [] arr = new int[nums.length - k + 1];
        Deque<Integer> st = new ArrayDeque<>();
        while(right<nums.length){
            while(!st.isEmpty() && nums[st.getLast()]< nums[right]){
                st.removeLast();
            }
            st.addLast(right);
            if(left>st.getFirst()){
                st.removeFirst();
            }
            if(right-left+1==k){
                arr[left] = nums[st.getFirst()];
                left++;
            }
            right++;
        }
        return arr;
    }
}
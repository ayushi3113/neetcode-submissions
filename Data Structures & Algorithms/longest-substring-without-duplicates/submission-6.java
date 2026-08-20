class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0,right = 0;
        int n = s.length();
        int max = 0;
        int [] arr = new int[256];
        for(int i = 0;i<arr.length;i++){
            arr[i] = -1;
        }
        while(right<n){
            char ch = s.charAt(right);
            if(arr[ch]>=left){
                left = arr[ch] + 1;
            }
            arr[ch] = right;
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}

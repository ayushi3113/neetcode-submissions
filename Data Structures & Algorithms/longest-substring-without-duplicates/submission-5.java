class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] arr = new int[256];
        for(int i = 0;i<arr.length;i++){
            arr[i] = -1;
        }
        int left = 0,right = 0;
        int maxLen = 0;
        int n = s.length();
        while(right<n){
            if(arr[s.charAt(right)]==-1){
                maxLen = Math.max(maxLen,right-left+1);
                arr[s.charAt(right)]=right;
            }
            else{
                 if(arr[s.charAt(right)]>=left){
                    left = arr[s.charAt(right)] + 1;
                }
                arr[s.charAt(right)]=right;
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}

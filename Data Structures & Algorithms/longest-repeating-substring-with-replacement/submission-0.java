class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0,right = 0;
        int len = 0,maxFreq = 0;
        int [] arr = new int[26];
        while(right<s.length()){
            char ch = s.charAt(right);
            arr[ch-'A']++;
            maxFreq = Math.max(maxFreq,arr[ch-'A']);
            if(((right-left+1)-maxFreq)<=k){
                len = Math.max(len,right-left+1);
            }
            if(((right-left+1)-maxFreq)>k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return len;
    }
}

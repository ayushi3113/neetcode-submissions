class Solution {
    public String minWindow(String s, String t) {
        int [] arr = new int[256];
        for(int i = 0;i<t.length();i++){
          arr[t.charAt(i)]++;
        }
        int left = 0,right=0;
        int count = 0;
        int idx = -1;
        int length = Integer.MAX_VALUE;
        while(right<s.length()){
           if(arr[s.charAt(right)]>0) count++;
           arr[s.charAt(right)]--;
            while(count==t.length()){
              if(right-left+1 < length){
                 idx = left;
                 length = right-left+1;
              }
              arr[s.charAt(left)]++;
              if(arr[s.charAt(left)]>0) count--;
              left++;
            }
           right++;
        }
        if(idx==-1) return "";
        return s.substring(idx,idx+length);
    }
}
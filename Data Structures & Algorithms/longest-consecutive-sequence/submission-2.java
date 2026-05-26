class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> ans = new HashSet<>();
        int length = 0;
        for(int num:nums){
            ans.add(num);
        }
        for(int x:ans){
            if(!ans.contains(x-1)){
                int c = 1;
                while(ans.contains(x+1)){
                    c = c+1;
                    x+=1;
                }
                length = Math.max(length,c);
            }
        }
        return length;
    }
}

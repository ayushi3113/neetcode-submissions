class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> st = new HashMap<>();
        int[] ans = new int[2];
        int k =0;
        for(int i = 0;i<nums.length;i++){
            if(st.containsKey(target-nums[i])){
                ans[0] = st.get(target-nums[i]);
                ans[1] = i;
            }
            else{
                st.put(nums[i],i);
            }
        }
        return ans;
    }
}
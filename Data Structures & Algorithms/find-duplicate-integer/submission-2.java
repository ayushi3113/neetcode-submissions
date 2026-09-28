class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0,fast = 0;
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow==fast) break;
        }
        int s1 = 0;
        while(slow<nums.length){
            s1 = nums[s1];
            slow = nums[slow];
            if(s1==slow) return s1;
        }
        return 0;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int TotalSum = (n*(n+1))/2;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
        }
        return TotalSum-sum1;
    }
}

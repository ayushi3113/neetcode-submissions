class Solution {
    public int findMin(int[] nums) {
        int x = -1;
        int st= 0 ,end = nums.length - 1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(mid<nums.length - 1 && nums[mid] > nums[mid+1]){
                x = mid;
                break;
            }
            else if(mid<nums.length - 1 && nums[mid] < nums[mid+1]){
                if(nums[mid]<nums[end]){
                    end = mid;
                }
                else{
                    st = mid+1;
                }
            }
            else{
                end = mid-1;
            }
        }
        if(x==-1) return nums[0]; 
        return nums[x+1];
    }
}
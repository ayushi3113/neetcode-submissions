class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length<nums2.length){
            return search(nums1,nums2);
        }
        else{
            return search(nums2,nums1);
        }
    }
    public double search(int[]nums1,int[]nums2){
        int st = 0,end=nums1.length;
        int n1 = nums1.length,n2 = nums2.length;
        while(st<=end){
            int mid1 = st + (end - st)/2;
            int mid2 = (n1 + n2 + 1)/2 - mid1;
            int l1 = (mid1-1<0)? Integer.MIN_VALUE : nums1[mid1-1];
            int l2 = (mid2-1<0)? Integer.MIN_VALUE : nums2[mid2-1];
            int r1 = (mid1>=nums1.length)? Integer.MAX_VALUE : nums1[mid1];
            int r2 = (mid2>=nums2.length)? Integer.MAX_VALUE : nums2[mid2];
            if(l1<=r2 && r1>=l2){
                // we have perfectely divided it 
                if((n1 + n2)%2 ==0){
                    // even size
                    int c = Math.max(l1,l2);
                    int d = Math.min(r1,r2);
                    return (double)(c+d)/2;
                }
                else{
                    // odd size
                    return Math.max(l1,l2);
                }
            }
            else if(r1<=l2){
                st = mid1 + 1;
            }
            else{
                end = mid1-1;
            }
        }
        return 0.0;
    }
}

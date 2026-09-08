class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return search(nums2,nums1);
        }
        else{
            return search(nums1,nums2);
        }
    }
    public double search(int[]nums1,int[]nums2){
        int st = 0,end = nums1.length;
        int n1 = nums1.length,n2 = nums2.length;
        while(st<=end){
            int cut1 = st + (end - st)/2;
            int cut2 = (n1 + n2 + 1)/2 - cut1;
            int l1 = cut1>0 ? nums1[cut1-1] : Integer.MIN_VALUE;
            int l2 = cut2>0 ? nums2[cut2-1] : Integer.MIN_VALUE;
            int r1 = cut1<nums1.length ? nums1[cut1] : Integer.MAX_VALUE;
            int r2 = cut2<nums2.length ? nums2[cut2] : Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1){
                if((n1 + n2)%2 == 0){
                    return (double)(Math.max(l1,l2) + Math.min(r1,r2))/2;
                }
                else{
                    return Math.max(l1,l2);
                }
            }
            else if(l1>r2){
                end = cut1-1;
            }
            else{
                st = cut1+1;
            }
        }
        return 0.0;
    }
}

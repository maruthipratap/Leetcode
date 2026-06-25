class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int p1=0,p2=0;
        int[] a=new int[m+n];
        int idx=0;
        while(p1<m && p2<n){
            if(nums1[p1]<nums2[p2]){
                a[idx++]=nums1[p1++];
            }else{
                a[idx++]=nums2[p2++];
            }
        }
        while(p1<m){
            a[idx++]=nums1[p1++];
        }
        while(p2<n){
            a[idx++]=nums2[p2++];
        }
        if(a.length%2!=0){
            return (double) a[(a.length)/2];
        }
        return (double) (a[(a.length-1)/2] + a[(a.length)/2])/2;
    }
}
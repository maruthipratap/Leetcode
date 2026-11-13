class Solution {
    public int mySqrt(int x) {
        int lo=0,hi=x;
       int ans=-1;
       while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        long sq=1L*mid*mid;
        if(sq==x){
           return mid;
        }else if(sq<x){
            ans=mid;
            lo=mid+1;
        }else{
            hi=mid-1;
        }
       } 
       return ans;
    }
}
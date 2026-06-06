class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=1,high=0;
        for(int val:weights){
            high+=val;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(mid,weights,days)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean isValid(int mid,int[] weights,int days){
        int temp=0;
        for(int x:weights){
            if(x>mid) return false;
            else if(temp+x>mid){
                days--;
                temp=x;
            }else{
                temp+=x;
            }
        }
        if(temp>0)days--;
        return days>=0;
    }
}
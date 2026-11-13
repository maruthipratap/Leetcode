class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int i:piles){
            high=Math.max(high,i);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canFinish(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean canFinish(int[] piles,int h,int speed){
        int totalHrs=0;
        for(int val:piles){
            totalHrs+=(val+speed-1)/speed;
            if(totalHrs>h){
                return false;
            }
        }
        return totalHrs<=h;
    }
}
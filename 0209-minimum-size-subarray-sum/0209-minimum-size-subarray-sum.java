class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        int p1=0;
        int sum=0;
        for(int p2=0;p2<n;p2++){
            sum+=nums[p2];
            while(sum>=target){
                ans=Math.min(ans,p2-p1+1);
                sum-=nums[p1];
                p1++;
                
            }
        }
        return (ans==Integer.MAX_VALUE)?0:ans;
    }
}
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long minVal=Integer.MAX_VALUE,maxVal=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            minVal=Math.min(minVal,nums[i]);
            maxVal=Math.max(maxVal,nums[i]);
            
        }
        return (long)k*(maxVal-minVal);
    }
}
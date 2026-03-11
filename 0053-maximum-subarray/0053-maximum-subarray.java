class Solution {
    public int maxSubArray(int[] nums) {
        int crntSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            crntSum=Math.max(nums[i],crntSum+nums[i]);
            maxSum=Math.max(maxSum,crntSum);
        }
        return maxSum;
    }
}
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1)return 0;
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n-1]-nums[n-k];
    }
}
class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        int len=0;
        Arrays.sort(nums);
        int l=0;
        for(int r=0;r<n;r++){
            while(nums[r]-nums[l]>1) l++;
            if(nums[r]-nums[l]==1){
                len=Math.max(len,r-l+1);
            }
        }
        return len;
    }
}
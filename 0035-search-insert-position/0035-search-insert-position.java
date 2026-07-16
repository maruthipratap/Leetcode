class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i]<target){
                idx=i+1;
            }
        }
        return idx;
        
    }
}
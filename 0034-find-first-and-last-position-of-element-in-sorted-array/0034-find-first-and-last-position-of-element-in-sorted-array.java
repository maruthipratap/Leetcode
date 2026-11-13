class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int left=binSearch(nums,target,true);
        int right=binSearch(nums,target,false);
        res[0]=left;
        res[1]=right;
        return res;
    }
    public int binSearch(int[] nums,int target, boolean isLeft){
        int low=0,high=nums.length-1,idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                idx=mid;
                if(isLeft){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return idx;
    }
}
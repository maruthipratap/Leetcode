class Solution {
    public int search(int[] nums, int target) {
        int k=0;
        int n=nums.length;
        int[] dup=new int[n];
        int idx=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                k=i;
                for(int j=k;j<n;j++){
                    dup[idx++]=nums[j];
                }break;
            }
        }
        if(k!=0){
            for(int i=0;i<k;i++){
                dup[idx++]=nums[i];
            }
        }else{
            dup=nums;
        }
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(dup[mid]==target){
                return (mid+k)%n;
            }else if(dup[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;


    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        int ans=0;
        for( int val: nums){
            ans^=val;
        }
        int pos=-1;
        for(int i=0;i<32;i++){
            if(((ans>>i)&1)==1){
                pos=i;
                break;
            }
        }
        int el1=0,el2=0;
        for(int i=0;i<nums.length;i++){
            if(((nums[i]>>pos)&1)==1){
                el1^=nums[i];
            }else{
                el2^=nums[i];
            }
        }
        return new int[]{el1,el2};
    }
}
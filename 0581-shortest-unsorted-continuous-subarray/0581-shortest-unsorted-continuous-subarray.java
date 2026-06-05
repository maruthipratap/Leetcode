class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length==1)return 0;
        if(nums.length==2) return (nums[0]>nums[1]) ? 2: 0;
        int ans=0;
        int[] dup=nums.clone();
        int p1=-1,p2=0;
        Arrays.sort(dup);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=dup[i]){
                if(p1==-1)p1=i;
                p2=i;
            }
        }
        if(p1==-1)return 0;
        return p2-p1+1;
    }
}
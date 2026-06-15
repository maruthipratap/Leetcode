class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<32;i++){
            int setBitCnt=0;
            for(int j=0;j<n;j++){
                if(((nums[j]>>i)&1)==1){
                    setBitCnt++;
                }
            }
            if(setBitCnt%3!=0){
                ans=ans|(1<<i);
            }
        }
        return ans;
    }
}
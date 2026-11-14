class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Integer.MAX_VALUE;
        boolean flag=false;
        int n=nums.size();
        for(int i=0;i<n;i++){
            int crnt=0;
            for(int j=i;j<n;j++){
                crnt+=nums.get(j);
                int length=j-i+1;
                if(length>r){
                    break;
                }
                if(length>=l && crnt>0){
                    ans=Math.min(ans,crnt);flag=true;
                }
            }
        }
        return flag?ans:-1;
    }
}
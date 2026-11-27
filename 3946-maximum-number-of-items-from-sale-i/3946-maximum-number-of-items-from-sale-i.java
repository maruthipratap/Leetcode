class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int[] freeCnt=new int[n];
        for(int i=0;i<n;i++){
            int factorI=items[i][0];
            int cnt=0;
            for(int j=0;j<n;j++){
                if(i!=j && items[j][0]%factorI==0){
                    cnt++;
                }
            }
            freeCnt[i]=cnt;
        }
        int[] dp=new int[budget+1];
        for(int i=0;i<n;i++){
            int price=items[i][1];
            if(price>budget){
                continue;
            }
            int frstCopyGain=1+freeCnt[i];
            for(int b=budget;b>=price;b--){
                dp[b]=Math.max(dp[b],dp[b-price]+frstCopyGain);
            }
            for(int b=price;b<=budget;b++){
                dp[b]=Math.max(dp[b],dp[b-price]+1);
            }
        }
        int ans=0;
        for(int b=0;b<=budget;b++){
            ans=Math.max(ans,dp[b]);
        }
        return ans;
    }
}
class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if(n<=k && m<=k){
            return 0;
        }  
        long minCost = Long.MAX_VALUE;
        for(int i=1;i<n;i++){
            int part1=i,part2=n-i;
            if(part1<=k && part2 <=k && m<=k){
                long cost = (long) part1*part2;
                minCost=Math.min(minCost,cost);
            }
        }
        for(int i=1;i<m;i++){
            int part1=i,part2=m-i;
            if(part1 <=k && part2 <=k && n<=k){
                long cost = (long) part1*part2;
                minCost = Math.min(minCost,cost);
            }
        }
        return minCost;
    }
}
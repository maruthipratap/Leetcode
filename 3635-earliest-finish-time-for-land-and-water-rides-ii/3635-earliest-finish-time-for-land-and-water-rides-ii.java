import java.util.*;

class Solution {

    public int earliestFinishTime(int[] landStartTime,int[] landDuration,
    int[] waterStartTime,int[] waterDuration) {

        int ans=Integer.MAX_VALUE;

        ans=Math.min(ans,
        solve(landStartTime,landDuration,waterStartTime,waterDuration));

        ans=Math.min(ans,
        solve(waterStartTime,waterDuration,landStartTime,landDuration));

        return ans;
    }

    private int solve(int[] startA,int[] durA,
    int[] startB,int[] durB) {

        int m=startB.length;

        int[][] rides=new int[m][2];

        for(int i=0;i<m;i++) {
            rides[i][0]=startB[i];
            rides[i][1]=durB[i];
        }

        Arrays.sort(rides,(a,b)->a[0]-b[0]);

        int[] prefixMinDur=new int[m];

        prefixMinDur[0]=rides[0][1];

        for(int i=1;i<m;i++) {
            prefixMinDur[i]=Math.min(prefixMinDur[i-1],rides[i][1]);
        }

        int[] suffixMinFinish=new int[m];

        suffixMinFinish[m-1]=rides[m-1][0]+rides[m-1][1];

        for(int i=m-2;i>=0;i--) {
            suffixMinFinish[i]=Math.min(
                suffixMinFinish[i+1],
                rides[i][0]+rides[i][1]
            );
        }

        int res=Integer.MAX_VALUE;

        for(int i=0;i<startA.length;i++) {

            int finishA=startA[i]+durA[i];

            int idx=upperBound(rides,finishA);

            if(idx>0) {
                res=Math.min(res,
                finishA+prefixMinDur[idx-1]);
            }

            if(idx<m) {
                res=Math.min(res,
                suffixMinFinish[idx]);
            }

        }

        return res;
    }

    private int upperBound(int[][] rides,int target) {

        int l=0;
        int r=rides.length;

        while(l<r) {

            int mid=l+(r-l)/2;

            if(rides[mid][0]<=target) {
                l=mid+1;
            } else {
                r=mid;
            }
        }

        return l;
    }
}
class Solution { 
    public int maxIceCream(int[] costs, int coins) { 
        int min=Integer.MAX_VALUE; 
        int max=Integer.MIN_VALUE; 
        for(int val:costs){
            min=Math.min(min,val); max=Math.max(max,val); 
        }
            int[] cntArr=new int[max-min+1]; 
            int[] out=new int[costs.length]; 
        for(int val:costs){ cntArr[val-min]++; } 
        for(int i=1;i<cntArr.length;i++){ cntArr[i]+=cntArr[i-1]; } 
        for(int i=costs.length-1;i>=0;i--){ 
            out[cntArr[costs[i]-min]-1]=costs[i]; 
            cntArr[costs[i]-min]--; 
        } 
        int cnt=0;
        for(int val:out){
            if(val>coins)break;
            cnt++;
            coins-=val;
        }
        return cnt; 
        
    } 
}
class Solution {
    public String largestTimeFromDigits(int[] arr) {
        int maxMin=-1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==j)continue;
                for(int k=0;k<4;k++){
                    if(k==i||k==j)continue;
                    for(int l=0;l<4;l++){
                        if(l==i||l==j||l==k)continue;

                        int hrs=arr[i]*10+arr[j];
                        int mins=arr[k]*10+arr[l];
                        if(hrs<24 && mins<60){
                            maxMin=Math.max(maxMin,hrs*60+mins);
                        }
                    }
                }
            }
        }
        if(maxMin==-1)return "";
        int hrs=maxMin/60;
        int mins=maxMin%60;
        return String.format("%02d:%02d",hrs,mins);
    }
}
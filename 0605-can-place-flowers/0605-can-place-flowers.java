class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int cnt) {
        int n=flowerbed.length;
        for(int i=0;i<n;i++){
            if(flowerbed[i]==0){
                int l=(i==0)?0:flowerbed[i-1];
                int r=(i==n-1)?0:flowerbed[i+1];
                if(l==0 && r==0){
                    flowerbed[i]=1;
                    cnt--;
                }
            }
            if(cnt<=0){
                return true;
            }
        }
        return cnt<=0;
    }
}
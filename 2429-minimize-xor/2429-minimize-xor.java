class Solution {
    public int minimizeXor(int num1, int num2) {
        int n=countset(num2);
        int n1=countset(num1);
        int ans=0;
        for(int i=31;i>=0 && n>0;i--){
            if(((num1>>i)&1)==1){
                ans|=(1<<i);
                n--;
            }
        }
        for(int i=0;i<31 && n>0 ;i++){
            if(((ans>>i)&1)==0){
                ans|=(1<<i);
                n--;
            }
        }
        return ans;
    }
    public static int countset(int n){
         int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n/=2;
        }
        return count;
    }
}
class Solution {
    public int minimizeXor(int num1, int num2) {
        int n=Integer.bitCount(num2);
        //int n1=countset(num1);
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
    
}
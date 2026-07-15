class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
        for(int i=1;i<=n*2;i++){
            if(i%2!=0){
                odd+=i;
            }else{
                even+=i;
            }
        }
        return gcd(odd,even);
    }
    public int gcd(int a,int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
class Solution {
    public int findGCD(int[] nums) {
        int a=Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;
        for(int x:nums){
            a=Math.max(a,x);
            b=Math.min(b,x);
        }
        return gcd(a,b);
    }
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}
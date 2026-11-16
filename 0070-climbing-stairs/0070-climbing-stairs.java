class Solution {
    public int climbStairs(int n) {
        if(n<=2)return n;
        int a=1;
        int b=2;
        int crnt=0;
        for(int i=3;i<=n;i++){
            crnt=a+b;
            a=b;
            b=crnt;
        }
        return crnt;
    }
}
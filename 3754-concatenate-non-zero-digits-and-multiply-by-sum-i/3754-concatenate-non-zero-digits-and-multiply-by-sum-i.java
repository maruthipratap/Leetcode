class Solution {
    public long sumAndMultiply(int n) {
        //int x=0;
        if(n==0)return 0;
        int sum=0;
        StringBuilder sb=new StringBuilder();      
        while(n>0){
            int dig=n%10;
            if(dig!=0){
                sum+=dig;
                sb.insert(0,dig);
            }
            n/=10;
        }
        if(sb.length()==0)return 0;
        return (long)Long.parseLong(sb.toString())*sum;
    }
}
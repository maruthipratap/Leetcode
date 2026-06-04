class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int val=num1;val<=num2;val++){
            char[] ch=Integer.toString(val).toCharArray();
            for(int i=1;i<ch.length-1;i++){
                int a=ch[i-1]-'0',b=ch[i]-'0',c=ch[i+1]-'0';
                if((a<b && b>c)||(a>b && b<c)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
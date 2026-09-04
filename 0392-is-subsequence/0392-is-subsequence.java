class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1=0,p2=0;
        int n=s.length(),m=t.length();
        //boolean ans=false;
        int cnt=0;
        while(p1<n && p2<m){
            char c1=s.charAt(p1);
            char c2=t.charAt(p2);
            if(c1==c2){
                cnt++;
                p1++;p2++;
            }else{
                p2++;
            }
        }
        return cnt==n;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0||s.length()==1)return true;
        int p1=0,p2=s.length()-1;
        while(p1<=p2){
            char a=s.charAt(p1);
            char b=s.charAt(p2);
            if(!Character.isLetterOrDigit(a)){
                p1++;
                continue;
            }
            if( !Character.isLetterOrDigit(b)){
                p2--;
                continue;
            }
            a=Character.toLowerCase(a);
            b=Character.toLowerCase(b);
            if(a!=b)return false;
            p1++;p2--;
        }
        return true;
    }
}
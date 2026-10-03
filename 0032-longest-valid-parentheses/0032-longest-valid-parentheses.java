class Solution {
    public int longestValidParentheses(String s) {
        int maxLen=0;
        int r=0,l=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                l++;
            }else{
                r++;
            }
            if(l==r){
                maxLen=Math.max(maxLen,2*r);
            }else if(r> l){
                l=r=0;
            }
        }
        l=r=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='('){
                l++;
            }else{
                r++;
            }
            if(l==r){
                maxLen=Math.max(maxLen,2*l);
            }else if(l>r){
                l=r=0;
            }
        }
        return maxLen;
    }
}
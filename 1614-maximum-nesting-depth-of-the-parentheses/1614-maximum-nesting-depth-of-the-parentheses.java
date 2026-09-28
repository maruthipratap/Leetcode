class Solution {
    public int maxDepth(String s) {
        int max=0;
        int crnt=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                crnt++;
                max=Math.max(max,crnt);
            }else if(ch==')'){
                crnt--;
            }
        }
        return max;
    }
}
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int op=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(op>0){
                    sb.append(c);
                }
                op++;
            }else{
                op--;
                if(op>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
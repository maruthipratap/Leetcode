class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                    sb.append(ch);
                }
        }
        return sb.toString();
    }
}
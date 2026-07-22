class Solution {
    public String finalString(String s) {
        int idx=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='i')sb.reverse();
            else sb.append(ch);
        }
        return sb.toString();
    }
}
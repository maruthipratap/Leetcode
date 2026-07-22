class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder ans=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                ans.append(ch);
            }
        }
        ans.reverse();
        int idx=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isLetter(ch)) sb.append(ch);
            else{
                sb.append(ans.charAt(idx++));
            }
              
             
        }
        return sb.toString();
    }
}
class Solution {
    public boolean checkString(String s) {
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='b' && i<s.length()-1 && s.charAt(i+1)!='b')return false;
        }
        return true;
    }
}
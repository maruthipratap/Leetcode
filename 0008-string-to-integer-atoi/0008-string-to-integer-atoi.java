class Solution {
    public int myAtoi(String s) {
        boolean minus=false;
        int idx=0;
        int n=s.length();
        while(idx<n && s.charAt(idx)==' '){
            idx++;
        }
        if(idx<n&&( s.charAt(idx)=='+'||s.charAt(idx)=='-')){
            minus=(s.charAt(idx)=='-');
            idx++;
        }
        int res=0;
        while(idx<n && Character.isDigit(s.charAt(idx))){
            
            int val=s.charAt(idx)-'0';
            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 &&val>7)){
                return minus?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            res=res*10+val;
            idx++;
        }
        
        return minus?-res:res;
    }
}
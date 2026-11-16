class Solution {
    public String digitSum(String s, int k) {
        String res=s;
        while(res.length()>k){
            String temp="";
            for(int i=0;i<res.length();i+=k){
                int sum=0;
                int end=Math.min(i+k,res.length());
                for(int j=i;j<end;j++){
                    sum+=res.charAt(j)-'0';
                }
                temp+=sum;
            }
            res=temp;
        }
        return res;
        
    }
}
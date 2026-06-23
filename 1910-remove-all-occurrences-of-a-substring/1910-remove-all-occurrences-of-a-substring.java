class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        int n=s.length()/part.length()+1;
        int x=part.length();
        while(n-->0){
            for(int i=0;i<=sb.length()-x;i++){
                if(sb.substring(i,i+x).equals(part)){
                    sb.delete(i,i+x);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
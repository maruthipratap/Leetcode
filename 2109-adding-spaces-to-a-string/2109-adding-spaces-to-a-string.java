class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int start=0;
        for(int i=0;i<spaces.length;i++){
            int end=spaces[i];
            sb.append(s.substring(start,end)).append(" ");
            start=end;
        }
        sb.append(s.substring(start,s.length()));
        return sb.toString();
    }
}
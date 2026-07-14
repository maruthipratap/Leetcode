class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        if(n<m)return -1;
        if((n==m)&& haystack.equals(needle)) return 0;
        for(int i=0;i<=n-m;i++){
            String dup=haystack.substring(i,i+m);
            if(dup.equals(needle))return i;
        }
        return -1;
    }
}
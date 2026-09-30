class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int[] a=new int[n];
        int depth=0;
        for(int i=0;i<n;i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                depth++;
                a[i]=depth%2;
            }else if(ch==')'){
                a[i]=depth%2;
                depth--;
            }
        }
        return a;
    }
}
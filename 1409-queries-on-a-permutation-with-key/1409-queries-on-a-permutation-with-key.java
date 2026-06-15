class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] a=new int[m];
        for(int i=1;i<=m;i++){
            a[i-1]=i;
        }
        int res[] =new int[queries.length];
        int ind=0;
        for(int i=0;i<queries.length;i++){
            int idx=search(a,queries[i]);
            res[ind++]=idx;
            swap(a,idx);
        }
        return res;
    }
    public static void swap(int[] ar,int idx){
        int temp=ar[idx];
        for(int i=idx;i>0;i--){
            ar[i]=ar[i-1];
        }
        ar[0]=temp;
    }
    public static int search(int[] ar,int val){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==val)return i;
        }
        return -1;
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> a=new ArrayList<>();
        for(int x:nums1){
            a.add(x);
        }
        List<Integer> b=new ArrayList<>();
        for(int x:nums2){
            if(a.remove(Integer.valueOf(x)))b.add(x);
        }
        int[] res=new int[b.size()];
        int idx=0;
        for(int x:b){
            res[idx++]=x;
        }
        return res;
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        for(int x:nums1){
            a.add(x);
        }
        Set<Integer> b=new HashSet<>();
        for(int x:nums2){
            if(a.contains(x)){
                b.add(x);
            }
        }
        
        int[] res=new int[b.size()];
        int id=0;
        for(int val:b){
            res[id++]=val;
        }
        return res;

    }
}
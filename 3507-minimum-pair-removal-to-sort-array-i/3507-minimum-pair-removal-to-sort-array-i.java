class Solution {
    public boolean isSort(ArrayList<Integer> l){
        for(int i=0;i<l.size()-1;i++){
            if(l.get(i)>l.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int val:nums)l.add(val);
        int cnt=0;
        int n=nums.length;
        while(!isSort(l)){
            int minSum=Integer.MAX_VALUE;
            int minIdx=0;
            for(int i=0;i<l.size()-1;i++){
                int sum=l.get(i)+l.get(i+1);
                if(sum<minSum){
                    minSum=sum;
                    minIdx=i;
                }
            }
            l.set(minIdx,minSum);
            l.remove(minIdx+1);
            cnt++;
        }
        return cnt;
    }
}
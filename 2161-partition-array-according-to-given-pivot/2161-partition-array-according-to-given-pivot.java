class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        List<Integer> big=new ArrayList<>();
        for(int val:nums){
            if(val<pivot){
                small.add(val);
            }else if( val> pivot){
                big.add(val);
            }else{
                equal.add(val);
            }
        }
        int idx=0;
        for(int val:small){
            nums[idx++]=val;
        }
        for(int val:equal){
            nums[idx++]=val;
        }
        for(int val:big){
            nums[idx++]=val;
        }
        return nums;
    }
}
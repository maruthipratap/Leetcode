class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int max=0,val=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>val){
                val=entry.getValue();
                max=entry.getKey();
            }
        }
        return max;
    }
}
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int frst=Integer.MAX_VALUE;
        int scnd=Integer.MAX_VALUE;

        for(int val:nums){
            if(val<=frst){
                frst=val;
            }else if(val<=scnd){
                scnd=val;
            }else{
                return true;
            }
        }
        return false;
    }
}
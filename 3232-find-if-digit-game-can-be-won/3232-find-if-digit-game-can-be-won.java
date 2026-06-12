class Solution {
    public boolean canAliceWin(int[] nums) {
        int oneSum=0,twoSum=0;
        for(int val: nums){
            if(val<10) oneSum+=val;
            else twoSum+=val;
        }
        return oneSum==twoSum?false:true;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int crntMax=nums[0];
        int crntMin=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            int temp=Math.max(x,Math.max(crntMax*x,crntMin*x));
            crntMin=Math.min(x,Math.min(crntMax*x,crntMin*x));
            crntMax=temp;
            max=Math.max(max,crntMax);
        }
        return max;
    }
}
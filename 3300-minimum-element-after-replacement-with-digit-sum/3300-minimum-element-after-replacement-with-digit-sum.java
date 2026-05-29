class Solution {
    public int minElement(int[] nums) {
        int minVal=Integer.MAX_VALUE;
        for(int val: nums){
            minVal=Math.min(minVal,digSum(val));
        }
        return minVal;
    }
    public static int digSum(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            n/=10;
        }
        return sum;
    }
}
class Solution {
    public int numOfSubarrays(int[] arr) {
        int oddCnt=0;
        int evenCnt=1;
        int totalOdd=0;
        int n=arr.length;
        int sum=0;
        int mod=1000000007;
        for(int num:arr){
            sum+=num;
            if(sum%2!=0){
                totalOdd=(totalOdd+evenCnt)%mod;
                oddCnt++;
            }else{
                totalOdd=(totalOdd+oddCnt)%mod;
                evenCnt++;
            }

        }
        return totalOdd;
    }
}
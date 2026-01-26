class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }int og=x,rev=0;
        while(x>0){
            int dig=x%10;
            rev=rev*10+dig;
            x/=10;
        }
        if(og==rev) return true;
        else return false;
    }
}
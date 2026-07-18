class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();

        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            int val=digitSum(n);
            set.add(n);
            n=val;
        }
        return true;
    }
    public int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=(int)Math.pow(n%10,2);
            n/=10;
        }
        return sum;
    }
}
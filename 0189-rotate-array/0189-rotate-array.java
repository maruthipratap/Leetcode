class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] dup=new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            dup[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=dup[i];
        }
    }
}
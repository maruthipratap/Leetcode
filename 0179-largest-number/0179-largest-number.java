class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=String.valueOf(nums[i]);
        } 
        Arrays.sort(a,(x,y) -> (y+x).compareTo(x+y));
        if(a[0].equals("0")) return "0";
        StringBuilder str=new StringBuilder();
        for(String val: a){
            str.append(val);
        }
        return str.toString();
    }
}
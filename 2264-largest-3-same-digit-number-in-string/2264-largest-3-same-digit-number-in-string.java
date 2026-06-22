class Solution {
    public String largestGoodInteger(String num) {
        //if(num.length()<=3)return "";
        int max=-1;
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2) ){
                int val=(num.charAt(i)-'0')*100 + (num.charAt(i+1)-'0')*10+(num.charAt(i+2)-'0');
                max=Math.max(val,max);
            }
        }
        if(max==-1) return "";
        return max==0?"000":String.valueOf(max);
    }
}
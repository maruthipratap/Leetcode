class Solution {
    public int binaryGap(int n) {
        String binary=Integer.toBinaryString(n);
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                al.add(i);
            }
        }
        if(al.size()<2) return 0;
        int maxAns=0;
        for(int i=0;i<al.size()-1;i++){
            maxAns=Math.max(maxAns,al.get(i+1)-al.get(i));
        }
        return maxAns;
    }
}
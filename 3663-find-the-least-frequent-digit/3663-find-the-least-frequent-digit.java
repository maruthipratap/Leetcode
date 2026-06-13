class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        while(n>0){
            int dig=n%10;
            map.put(dig,map.getOrDefault(dig,0)+1);
            n/=10;
        }
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()<min){
                min=entry.getValue();
                ans=entry.getKey();
            }
        }
        return ans;
    }
}
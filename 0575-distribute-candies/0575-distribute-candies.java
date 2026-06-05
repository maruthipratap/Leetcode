class Solution {
    public int distributeCandies(int[] candyType) {
        if(candyType.length%2!=0)return 0;
        Set<Integer> set=new HashSet<>();
        for(int val:candyType){
            set.add(val);
        }
        return Math.min(set.size(),candyType.length/2);
    }
}
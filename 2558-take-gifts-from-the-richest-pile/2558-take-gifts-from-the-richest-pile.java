class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int val:gifts){
            pq.offer(val);
        }
        while(k-->0){
            int temp=pq.poll();
            pq.offer((int)Math.sqrt(temp));
        }
        long sum=0;
        for(int val:pq){
            sum+=val;
        }
        return sum;
    }
}
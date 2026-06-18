class Solution {
    public String winningPlayer(int x, int y) {
        if(x<1 || y<4) return "Bob";
        int turns=Math.min(x,y/4);
        return turns%2!=0 ? "Alice":"Bob";
    }
}
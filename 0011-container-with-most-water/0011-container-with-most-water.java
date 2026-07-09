class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int p1=0,p2=height.length-1;
        while(p1<p2){
            int val=Math.min(height[p1],height[p2]);
            ans=Math.max(ans,(val*(p2-p1)));
            if(height[p1]<height[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return ans;
    }
}
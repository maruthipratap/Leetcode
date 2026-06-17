class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        
        for(int val: asteroids){
            boolean flag=true;
            while(flag && val<0 && !stack.isEmpty() && stack.peek()>0){
                if(stack.peek() < -val){
                    stack.pop();
                }else if(stack.peek() == -val){
                    stack.pop();
                    flag=false;
                }else{
                    flag =false;
                }
            }
            if(flag){
                stack.push(val);
            }
        }
        int[] ans=new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
    }
}
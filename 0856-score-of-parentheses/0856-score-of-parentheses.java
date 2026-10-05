class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(0);
            }else{
                int inScore=stack.pop();
                int crnt=Math.max(2*inScore,1);
                stack.push(stack.pop()+crnt);
            }
        }
        return stack.peek();
    }
}
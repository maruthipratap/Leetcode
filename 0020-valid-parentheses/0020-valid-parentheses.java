class Solution {
    public boolean isValid(String s) {
        if(s.length()==1)return false;
        Stack<Character> stack=new Stack<>();
        char[] str=s.toCharArray();
        for(char ch:str){
            if(ch=='('||ch=='[' || ch=='{'){
                stack.push(ch);
            }else if(ch==')' ){
                if(stack.isEmpty()) return false;
                if(stack.peek()=='('){
                    stack.pop();
                }else return false;
            }else if(ch==']'){
                if(stack.peek()=='['){
                    stack.pop();
                }else return false;
            }else{
                if(stack.peek()=='{'){
                    stack.pop();
                }else return false;
            }
        }
        if(!stack.isEmpty())return false;
        return true;
    }
}
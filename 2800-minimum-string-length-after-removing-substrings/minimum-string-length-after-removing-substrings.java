class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != 'B' && c != 'D'){
                stack.push(c);
            }
            else if(c == 'B'){
                if(!stack.isEmpty() && stack.peek() == 'A') stack.pop();
                else stack.push(c);
            }
            else{
                if(!stack.isEmpty() && stack.peek() == 'C') stack.pop();
                else stack.push(c);
            }
        }
        return stack.size();
    }
}
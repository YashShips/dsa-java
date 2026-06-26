class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        char[] ans = new char[s.length];
        for(char a : s){
            stack.push(a);
        }
        for(int i = 0; i < s.length; i++){
            s[i] = stack.pop();
        }
    }
}
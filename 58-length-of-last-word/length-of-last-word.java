class Solution {
    public int lengthOfLastWord(String s) {
        Stack<String> stack = new Stack<>();
        String[] ans = s.trim().split("\\s+");
        for(String str : ans){
            stack.push(str);
        }
        return stack.pop().length();
    }
}
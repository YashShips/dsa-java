class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String[] ans = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String str : ans){
            stack.push(str);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
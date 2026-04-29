class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String a = new StringBuilder(s).reverse().toString();
        return s.equals(a);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
       if(x < 0) return false;
       int a = x;
       int b = 0;
       while(x != 0){
        int last = x % 10;
        b = b * 10 + last;
        x /= 10;
       }
       return a == b;
    }
}
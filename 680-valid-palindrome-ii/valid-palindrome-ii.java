class Solution {
    public boolean helper(int a, int b , String s){
        while( a < b ){
            char left = s.charAt(a), right = s.charAt(b);
            if(left != right) return false;
            else{
                a++;
                b--;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
      int a = 0, b = s.length() - 1;
      while(a < b){
         char left = s.charAt(a), right = s.charAt(b);
         if(left != right){
            // return the function call
            return helper(a + 1, b, s) || helper(a , b - 1, s);
         }
         else{
            a++;
            b--;
         }
      }
      return true;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
       int a = 0,
           b = s.length() - 1;
        
        while(a < b){
            while(a < b && !Character.isLetterOrDigit(s.charAt(a))){
                a++;
            }
            while(a < b && !Character.isLetterOrDigit(s.charAt(b))){
                b--;
            }

            char l = Character.toLowerCase(s.charAt(a));
            char r = Character.toLowerCase(s.charAt(b));

            if( l != r ) return false;
            a++;
            b--;
        }
        return true;
    }
}
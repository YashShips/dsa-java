class Solution {
    public boolean isHappy(int n) {
       int slow = n,
        fast = n;
        
        while(fast != 1){
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));

            if(fast == 1) return true;
            if(slow == fast) return false;
        }
        return true;
    }
    public int getNextNumber(int n ){
        int output = 0;
        while(n > 0){
            int digit = n % 10;
            output += digit * digit;
            n = n / 10;
        }
        return output;
    }
}
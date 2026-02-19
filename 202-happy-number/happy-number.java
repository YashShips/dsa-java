class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> visit = new HashSet<>();
       while(!visit.contains(n)){
        visit.add(n);
        if( n == 1 ) return true;
        n = getNextNumber(n);
       }
       return false;
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
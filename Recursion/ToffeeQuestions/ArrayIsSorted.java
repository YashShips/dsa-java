/**
 * Problem: You’re given an integer array, e.g.
[1, 2, 3, 4, 5] → true
[3, 4, 2, 8, 10] → false

We need to check if it’s strictly increasing — using recursion only.

No loops.
No helper arrays.

 * Author: Yash Yadav
 * Date: 11
 */

class Main {
  public static boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        if( arr[index] > arr[index + 1] ){
            return false;
        }
        return isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,9,10};
        System.out.print(isSorted(arr, 0));
    }
}
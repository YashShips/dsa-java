/**
 * Problem: 
 *You’re given an array of integers.
You need to find the maximum element using recursion — no loops.

Example:

Input: [3, 1, 5, 2, 9, 4]
Output: 9

 * Author: Yash Yadav
 * Date: 11
 */

import java.util.*;
class Main {
    public static int Max(int[] arr, int index){
        if(index == arr.length - 1){
            return arr[index];
        }
        int maxInRest = Max(arr, index + 1);        
        return Math.max(arr[index], maxInRest);
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,78,2,1,9,0};
        System.out.print("The max element among the array is " + Max(arr, 0));
    }
}

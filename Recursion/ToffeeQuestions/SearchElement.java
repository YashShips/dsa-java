/**
 * Problem: You’re given an integer array and a target element.
You must check whether the target exists in the array using recursion.

Example:

Input: arr = [3, 5, 2, 9, 4], target = 9
Output: true

Input: arr = [1, 7, 3, 8], target = 10
Output: false

 * Author: Yash Yadav
 * Date: 11
 */

import java.util.*;
class Main {
    public static boolean Search(int[] arr, int index, int target){
        if(index == arr.length){
            return false;
        }
        else if(arr[index] == target){
            return true;
        }        
        return Search(arr, index + 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,78,2,1,9,0};
        System.out.print(Search(arr, 0, 999));
    }
}
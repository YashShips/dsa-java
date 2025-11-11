/** 
 * 🎯 Problem Statement

Given an array of integers, find the sum of all elements using recursion.

Example:
Input → arr = [3, 2, 5, 1, 6]
Output → 17
 * 
 */
/**
 * Author: Yash Yadav
 * Date: 11
 */

class Main {
 public static int Sum(int[] arr, int index){
        if(index == arr.length - 1){
            return arr[index];
        }
        return arr[index] + Sum(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2 , 3, 4, 5};
        int totalSum = Sum(arr, 0);
        System.out.print("The Sum Of all the elements in the Array is : " + totalSum);
    }
}
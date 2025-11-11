/**
 * Problem: https://leetcode.com/problems/reverse-string/
 * Difficulty: Easy
 * Approach: Two Pointer + Recurssion
 * 
 * Author: Yash Yadav
 * Date: 11
 */

/**
 * 🧠 Placement Insight

This specific pattern (start, end, base case = start >= end) is a recursion archetype.
In interviews, the moment you see “check from both ends” or “mirror something”, this pattern should instantly click.
 */

class Solution {
 public void helper(char[] s, int start, int end){
        if(start >= end){
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        helper(s, start + 1, end - 1);
    }
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
}
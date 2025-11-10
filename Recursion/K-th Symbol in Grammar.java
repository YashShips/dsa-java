/**
 * Problem: https://leetcode.com/problems/k-th-symbol-in-grammar/
 * Difficulty: Medium
 * Approach: Recursion + Divide and Conquer
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Author: Yash Yadav
 * Date: 2025-11-10
 */

class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1 && k == 1) return 0;
        int mid = 1 << (n - 2);
        if (k <= mid) return kthGrammar(n - 1, k);
        else return 1 ^ kthGrammar(n - 1, k - mid); // Note: XOR, not <<
    }
}

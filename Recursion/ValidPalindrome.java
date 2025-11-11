/**
 * Problem: https://leetcode.com/problems/your-problem/
 * Difficulty: Easy/Medium/Hard
 * Approach: Approach description
 * Time Complexity: O()
 * Space Complexity: O()
 * 
 * Author: Yash Yadav
 * Date: 11
 */

/**
 * 🔥 LeetCode 125 — Valid Palindrome
 * 
 * 🧠 Problem Summary:
 * Given a string `s`, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring case sensitivity.
 * 
 * Example:
 * Input:  "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: After ignoring non-alphanumeric characters and case,
 *              the string becomes "amanaplanacanalpanama", which is a palindrome.
 * 
 * ---------------------------------------------------------------------
 * 💡 Intuition:
 * A palindrome reads the same forward and backward.
 * 
 * We'll use a **two-pointer recursive approach**:
 *   - One pointer starts from the left (`start`)
 *   - The other starts from the right (`end`)
 *   - We compare characters at both ends.
 * 
 * If both characters are equal → we move inward (`start+1`, `end-1`).
 * If any mismatch occurs → return false.
 * 
 * Before comparing:
 *   - We skip all non-alphanumeric characters (like spaces, commas, etc.)
 *   - Convert everything to lowercase for case-insensitive comparison.
 * 
 * The recursion stops when both pointers meet or cross (`start >= end`).
 * That means all characters matched — it's a palindrome.
 * 
 * ---------------------------------------------------------------------
 * 🧩 Recursive Breakdown Example (for "race a car"):
 * 
 * Cleaned string = "raceacar"
 * 1️⃣ Compare r == r → ✅ → call helper(1,6)
 * 2️⃣ Compare a == a → ✅ → call helper(2,5)
 * 3️⃣ Compare c == c → ✅ → call helper(3,4)
 * 4️⃣ Compare e != a → ❌ → return false
 * 
 * So final output → false
 * 
 * ---------------------------------------------------------------------
 * ⚙️ Time Complexity:  O(n) — each character is checked once
 * ⚙️ Space Complexity: O(n) — recursion call stack depth
 * 
 * 🧠 Why This Works:
 * This uses the “two-pointer validation” recursion pattern:
 *   - Base case → when pointers meet
 *   - Recursive case → check ends + move inward
 * 
 * This same logic applies to other problems like:
 *   - Check palindrome linked list
 *   - Mirror trees
 *   - Symmetric strings
 */

class Solution {
    public boolean isPalindrome(String s) {
        // Convert string to lowercase to make it case-insensitive
        s = s.toLowerCase();

        // Start recursion with two pointers: left (0) and right (length-1)
        return helper(s, 0, s.length() - 1);
    }

    // Recursive helper function
    public boolean helper(String s, int start, int end) {

        // ✅ Base Case: if pointers meet or cross, all characters matched
        if (start >= end) {
            return true;
        }

        // 🧹 Skip non-alphanumeric characters on the left
        if (!Character.isLetterOrDigit(s.charAt(start))) {
            return helper(s, start + 1, end);
        }

        // 🧹 Skip non-alphanumeric characters on the right
        if (!Character.isLetterOrDigit(s.charAt(end))) {
            return helper(s, start, end - 1);
        }

        // ❌ If mismatch, string is not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // ✅ If match, move inward and continue checking
        return helper(s, start + 1, end - 1);
    }
}

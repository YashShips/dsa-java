/**
 * Author: Yash Yadav
 * Date: 12
 */

/**
 * 🍬 Toffee Question #6 — Print All Subsequences of a String
 * 
 * 🧠 Problem Summary:
 * Given a string `s`, print all possible subsequences of it using recursion.
 * A subsequence is formed by deleting zero or more characters from the string 
 * (without changing their relative order).
 * 
 * Example:
 * Input:  "abc"
 * Output: ["", "a", "b", "c", "ab", "ac", "bc", "abc"]
 * 
 * ---------------------------------------------------------------------
 * 💡 Intuition:
 * At each character, we have **two choices**:
 *  1️⃣ Include the current character in the subsequence.
 *  2️⃣ Exclude the current character.
 * 
 * This creates a binary recursion tree — where each level represents one character
 * and each branch represents one decision (include or exclude).
 * 
 * This “include–exclude” recursion pattern is the foundation for:
 *  - Subsets (LeetCode 78)
 *  - Subsets II (LeetCode 90)
 *  - Combination Sum (LeetCode 39)
 *  - Subset Sum problems
 *  - Backtracking in general
 * 
 * ---------------------------------------------------------------------
 * 🧩 Recursion Tree Example (for "abc"):
 * 
 *                    "" (start)
 *                 /          \
 *               "a"           ""
 *             /     \        /    \
 *           "ab"     "a"   "b"     ""
 *          /   \    /     / \     / \
 *       "abc" "ab" "ac" "a" "bc" "b" "c" ""
 * 
 * → Output: ["", "a", "b", "c", "ab", "ac", "bc", "abc"]
 * 
 * ---------------------------------------------------------------------
 * ⚙️ Base Case:
 * When `index == s.length()`, it means we’ve considered all characters,
 * so we simply print the current `output` string.
 * 
 * 🧠 Recursive Case:
 * - Call 1: include current character → output + s.charAt(index)
 * - Call 2: exclude current character → output (unchanged)
 * 
 * ---------------------------------------------------------------------
 * 🕒 Time Complexity:  O(2^n)
 * 🧮 Space Complexity: O(n) — recursion call stack
 * 
 * Each character leads to two recursive calls (include/exclude),
 * so total subsequences = 2ⁿ.
 * 
 * ---------------------------------------------------------------------
 * ✅ Example Run:
 * Input: "abc"
 * Output Order:
 *  abc, ab, ac, a, bc, b, c, (empty)
 * 
 * ---------------------------------------------------------------------
 */

import java.util.*;

class Main {

    // Recursive function to print all subsequences of a given string
    public static void seq(String s, String output, int index) {

        // ✅ Base Case: when we've reached the end of the string
        if (index == s.length()) {
            System.out.println(output); // print one possible subsequence
            return;
        }

        // 🧩 Recursive Case 1: include current character
        seq(s, output + s.charAt(index), index + 1);

        // 🧩 Recursive Case 2: exclude current character
        seq(s, output, index + 1);
    }

    public static void main(String[] args) {
        String s = "abc";

        // Initial call: start with empty subsequence and index = 0
        seq(s, "", 0);
    }
}

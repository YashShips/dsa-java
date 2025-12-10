/**
 * git sol — LeetCode 231: Power of Two (Recursive Solution)
 *
 * Intuition:
 * A number is a power of two if we can repeatedly divide it by 2
 * until we reach 1. If at any point the number becomes odd (except 1),
 * or becomes zero/negative, it is NOT a power of two.
 *
 * Recurrence:
 *   isPowerOfTwo(n) = isPowerOfTwo(n / 2) if n is even and > 1
 *
 * Base Cases:
 *   - If n == 1 → true  (2^0 = 1)
 *   - If n <= 0 → false (powers of two are always positive)
 *   - If n is odd → false (except 1)
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(log n) recursion depth
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        // Failure base case: non-positive numbers cannot be powers of 2
        if (n <= 0) return false;

        // Success base case
        if (n == 1) return true;

        // If n is odd (but not 1), it cannot be a power of 2
        if (n % 2 != 0) return false;

        // Recursive case: keep dividing by 2
        return isPowerOfTwo(n / 2);
    }
}
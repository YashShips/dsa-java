/**
 * git sol — LeetCode 704: Binary Search (Recursive Solution)
 *
 * Problem:
 * Given a sorted integer array `nums` and an integer `target`,
 * return the index of `target` if it exists. Otherwise return -1.
 *
 * Why this problem matters:
 * - Classic divide-and-conquer recursion pattern.
 * - Teaches how to manage search space using left and right pointers.
 * - Foundation for tree recursion, graph search, DP on ranges.
 *
 * Recursion Intuition:
 * We maintain a search range: nums[left ... right]
 *
 * Base Case (failure):
 *   - If left > right, the search space is empty → return -1.
 *
 * Success Case:
 *   - If nums[mid] == target → return the index mid.
 *
 * Recursive Cases:
 *   - If target < nums[mid] → search left half → binarySearch(left, mid - 1)
 *   - If target > nums[mid] → search right half → binarySearch(mid + 1, right)
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(log n) due to recursion call stack
 */

class Solution {

    // Public method called by LeetCode
    public int search(int[] nums, int target) {
        // Initial search range is entire array
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    // Recursive binary search function
    private int binarySearch(int[] nums, int left, int right, int target) {

        // --- BASE CASE (failure): search range is invalid ---
        if (left > right) {
            return -1;  // target not found
        }

        // Compute mid safely (prevents overflow)
        int mid = left + (right - left) / 2;

        // --- SUCCESS CASE ---
        if (nums[mid] == target) {
            return mid;
        }

        // --- RECURSIVE CASES ---
        // If target is smaller → search left half
        if (target < nums[mid]) {
            return binarySearch(nums, left, mid - 1, target);
        }

        // Else target is larger → search right half
        return binarySearch(nums, mid + 1, right, target);
    }
}
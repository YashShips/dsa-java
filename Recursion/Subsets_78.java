/**
 * git sol — LeetCode 78: Subsets
 *
 * Problem:
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 *
 * Example:
 *   Input:  nums = [1, 2, 3]
 *   Output: [[], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]]
 *
 * Intuition (Include–Exclude / Backtracking):
 * At each index we have exactly two choices:
 *   1) INCLUDE nums[index] into the current subset
 *   2) EXCLUDE nums[index] from the current subset
 * After making a choice we move to index + 1. When index == nums.length,
 * the current list is one complete subset — add a copy to result.
 *
 * Implementation details:
 * - We pass `current` (the working 1D list) and `result` (the final 2D list) into the helper.
 * - We mutate `current` in-place (add then remove) to avoid creating many lists.
 * - Always add a COPY of `current` to `result` (new ArrayList<>(current)) because `current` is reused.
 *
 * Time Complexity: O(2^n) — generate 2^n subsets, each subset can take up to O(n) to copy.
 * Space Complexity: O(n) recursion depth + O(2^n * n) output size (dominant).
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    // Helper: nums -> input array, index -> current position,
    // current -> current subset being built, result -> final list of subsets
    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: we've considered every element, add a COPY of current to result
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // 1) Include nums[index]
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);

        // 2) Exclude nums[index] (backtrack)
        current.remove(current.size() - 1); // undo the include
        generateSubsets(nums, index + 1, current, result);
    }
}
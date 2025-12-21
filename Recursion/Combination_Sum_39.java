/**
 *
 * Problem:
 * Given an array of distinct integers candidates and a target integer,
 * return all unique combinations where the chosen numbers sum to target.
 *
 * Rules:
 * - Each number in candidates may be used unlimited times
 * - Order of combinations does not matter
 *
 * Core Backtracking Intuition:
 * At each index, we have TWO choices:
 * 1) Pick the current number → stay on the same index (reuse allowed)
 * 2) Skip the current number → move to the next index`
 *
 * Why duplicates are avoided:
 * - Once we skip an index, we never go back to it
 * - This ensures combinations are built in increasing index order
 *
 * Base Cases:
 * - If target == 0 → valid combination found
 * - If target < 0 OR index == candidates.length → invalid path
 *
 * Time Complexity: Exponential (depends on target and candidates)
 * Space Complexity: O(target) recursion depth (worst case)
 */

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates,
                           int target,
                           int index,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // ✅ Success base case
        if (target == 0) {
            result.add(new ArrayList<>(current)); // add copy
            return;
        }

        // ❌ Failure base case
        if (target < 0 || index == candidates.length) {
            return;
        }

        // 🔁 Choice 1: PICK current element (reuse allowed)
        current.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index, current, result);
        current.remove(current.size() - 1); // backtrack

        // ⏭️ Choice 2: SKIP current element
        backtrack(candidates, target, index + 1, current, result);
    }
}
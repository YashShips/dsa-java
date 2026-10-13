class Solution:
    def searchRange(self, nums: list[int], target: int) -> list[int]:
        first = self.lower_bound(nums, target)
        if first == len(nums) or nums[first] != target:
            return [-1,-1]
        last = self.upper_bound(nums, target) - 1
        return [first, last]
    def upper_bound(self,nums, target):
        left, right = 0, len(nums)
        while left < right :
            mid = left + (right - left) // 2
            if nums[mid] > target :
                right = mid
            else :
                left = mid + 1
        return right

    def lower_bound(self,nums, target):
        left, right = 0, len(nums)
        while left < right :
            mid = left + (right - left) // 2
            if nums[mid] >= target :
                right = mid
            else :
                left = mid + 1
        return left
    
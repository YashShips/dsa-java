class Solution:
    def getConcatenation(self, nums: list[int]) -> list[int]:
        ans = []
        for n in range(2):
            for i in nums:
                ans.append(i)
        return ans
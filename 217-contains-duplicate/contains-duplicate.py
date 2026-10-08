class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        hs = set()
        for i in nums:
            if i in hs:
                return True
            else :
                hs.add(i)
        return False

class Solution:
    def nextGreatestLetter(self, letters: list[str], target: str) -> str:
        first, last = 0, len(letters) 
        while first < last:
            mid = first + (last - first) // 2
            if ord(letters[mid]) > ord(target):
               last = mid
            else:
                first = mid + 1
        if last == len(letters):
            return letters[0]
        else :
            return letters[last]
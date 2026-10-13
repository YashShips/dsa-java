class Solution:
    def nextGreatestLetter(self, letters: list[str], target: str) -> str:
        first, last = 0, len(letters) 
        while first < last:
            mid = first + (last - first) // 2
            if ord(letters[mid]) > ord(target):
               last = mid
            else:
                first = mid + 1
        ##If index is ever out of bound, this is how we wrap it around
        return letters[first % len(letters)]
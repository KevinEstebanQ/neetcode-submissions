class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d1 = dict()
        d2 = dict()
        for c in s:
            d1[c] = 1 + d1.get(c,0)
        for c in t:
            d2[c] = 1 + d2.get(c,0)
        return d1 == d2
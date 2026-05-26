class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        t1 = [0] * 26
        if len(s) != len(t):
            return False
        for i in range (len(s)):
            t1[ord(s[i])%26]+=1
            t1[ord(t[i])%26]-=1

        for val in t1:
            if val != 0:
                return False
        return True
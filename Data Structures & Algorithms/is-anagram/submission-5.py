class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        word_dict = dict()

        for i in range(len(s)):
            word_dict[s[i]] = word_dict.get(s[i], 0) + 1
            word_dict[t[i]] = word_dict.get(t[i],0) - 1

        for k,v in word_dict.items():
            if v != 0:
                return False
        return True
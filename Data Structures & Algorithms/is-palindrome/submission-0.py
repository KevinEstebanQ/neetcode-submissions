class Solution:
    def isPalindrome(self, s: str) -> bool:
        def reverse(s):
            tmp=""
            for i in range(len(s)-1, -1, -1):
                if s[i].isalnum():
                    tmp+=s[i].lower()
            return tmp


        newStr=""

        for c in s:
            if c.isalnum():
                newStr+=c.lower()

        return  newStr == reverse(s)

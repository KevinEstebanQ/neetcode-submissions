class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ""
        for s in strs:
            str_len = len(s)
            encoded = encoded + f"{str_len}-"+s

        return encoded

    def decode(self, s: str) -> List[str]:
        ans = []
        i = 0
        while i < len(s):
            j = i
            while s[j] != "-":
                j+=1
            str_len = int(s[i:j])
            ans.append(s[j+1:j+str_len+1])
            i = j+1 + str_len
        return ans


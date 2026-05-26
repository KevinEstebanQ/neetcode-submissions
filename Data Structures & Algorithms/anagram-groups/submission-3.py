class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ansMap = dict()
        for word in strs:
            freqList = [0] * 26
            for c in word:
                freqList[ord(c) - ord('a')] +=1
            if ansMap.get(tuple(freqList), None) != None:
                ansMap[tuple(freqList)].append(word)
            else:
                ansMap[tuple(freqList)] = [word]
        return list(ansMap.values())
            

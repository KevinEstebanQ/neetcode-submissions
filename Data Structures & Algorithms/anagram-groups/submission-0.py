class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        counts = defaultdict(list)
        for s in strs:
            ordCounts = [0] * 26
            for c in s:
                ordCounts[ord(c) - ord('a')] +=1 # frequency of said string
            #freq list added to map
            counts[tuple(ordCounts)].append(s)
            
        return list(counts.values())

                

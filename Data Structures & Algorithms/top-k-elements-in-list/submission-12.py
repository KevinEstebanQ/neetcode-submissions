class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # buckets
        buckets = [[] for n in range(len(nums) + 1)]

        freq = {}
        for num in nums:
            freq[num] = freq.get(num, 0) + 1

        for num, cnt in freq.items():
            buckets[cnt].append(num)


        ans = []
        for i in range(len(buckets) - 1, -1, -1):
            for num in buckets[i]:
                if len(ans) == k:
                    return ans
                ans.append(num)
        return ans




        
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        bucket = [[] for num in nums]
        map = dict()
        ans = []

        for i in range(len(nums)): # nums : freq
            map[nums[i]] = 1 + map.get(nums[i], 0)

        for key,v in map.items():
            bucket[map.get(key)-1].append(key)

        for i in range(len(nums)-1,-1, -1):
            if len(ans) == k:
                return ans
            if len(bucket[i]) > 0:
                for num in bucket[i]:
                    ans.append(num)
            
                
        return ans
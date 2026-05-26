class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = dict() # frequencies
        arr = [[]for num in nums] #save the num based on its frequency,frequency from map is the index of array
        ans = []

        for num in nums:
            map[num] = map.get(num,0) + 1

        for  key,v in map.items():
            arr[map.get(key)-1].append(key)

        for i in range(len(nums)-1, -1, -1):
            if len(ans) == k:
                return ans
            if len(arr[i]) > 0:
                for num in arr[i]:
                    ans.append(num)

        return ans
        
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        myMap = dict()
        for i in range(len(nums)):

            myTarget = target - nums[i]
            if myMap.get(myTarget, None) != None:

                return [myMap[myTarget], i]
            myMap[nums[i]] = i
        return []
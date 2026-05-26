class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # [1,2,4,6]
        # [1,2,4,6]
        # for every index i in array, arra[i] = prod(everythin but array[i])
        #nums [0] = 1, nums[0] = 2*4*6 = 48
        #nums [1] = 2, nums [1] = 1*4*6 = 24

        # for i in range(n) -> curr=nums[i]; if nums[i] != curr -> ans[i]*=nums[i]
        ans = []

        for i in range(len(nums)):
            curr = nums[i]
            accum = 1
            for j in range(len(nums)):
                if j != i:
                    accum*=nums[j]
            ans.append(accum)
        return ans

        # i = 1, nums[1] = 2, curr = 2, nums[0]= 1 != 1 ? 
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)-1 
        ans = [0] * (n+1)
        preff = [0] * (n+1)
        suff = [0] * (n+1)
        
        preff[0] = 1
        suff[n] = 1
        

        for i in range(1, n+1):
            preff[i] =  nums[i-1] * preff[i-1]
        for i in range(n - 1, -1, -1):
            suff[i] =  nums[i+1] * suff[i+1]
        for i in range(n+1):
            ans[i] = suff[i]*preff[i]

        return ans

    # [1,2,4,6] nums ----------------formulas --------------
    #                            (n=len(nums)-1)
    # [1 ,1, 2, 8]               preff[i] = nums[i-1] * preff[i-1]
    # [48,24,6, 1]               suff[i] = nums[n+1] * preff[i+1]
    # [48,24,12,8]               ans[i] = pref[i] * suff[i]
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        self.maxProfit = 0

        for i in range(len(prices)):
            for j in range(i+1, len(prices)):
                self.maxProfit = max(self.maxProfit, prices[j]-prices[i])

        return self.maxProfit
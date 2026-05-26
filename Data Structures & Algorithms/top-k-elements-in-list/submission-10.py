class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

       #[1,2,2,3,3,3] # k = amount of elements to return -> if k ==2 the return 1st most freq, 2nd most freq
       # get freq arr<tupples> (val, freq) freq  = arr[i][1]==freqOfi
       #sort, lambda sort by freq
       # for i in range(len(n), -1, -1) ans.append(arr1.pop()[1])


        #create our freq dict
        freq={}
        for num in nums:
            freq[num] = freq.get(num,0) + 1

        #sort our dict
        sorted_frequencies = sorted(freq.items(), key=lambda x: x[1])

        #create or ans array and populated wit k elements
        ans = [0] * (k)
        for i in range(len(ans)-1, -1, -1):
            ans[i] = sorted_frequencies.pop()[0]

        return ans




        
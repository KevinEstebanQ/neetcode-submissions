class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // freq map k,v = num, freq X
        // ans arraylist x
        //bucket = [[],[],[],[]] where bucker[i] is element at bucket[i] X
        // is element with freq i x
        //create map and bucket X
        // return the k most freq element
        //skip empty buckects x.length == 0
        // ans.add(num) 

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for(int num : freqMap.keySet()){
            buckets[freqMap.get(num)].add(num);
        }

        int[] ans = new int[k];
        int index = 0;
        for(int i = buckets.length - 1; i > 0 && index < k ; i--){
            for(int n: buckets[i]){
                ans[index] = n;
                index++;
                if (index == k){
                    return ans;
                }
            }
        }
        return ans;
    }
}

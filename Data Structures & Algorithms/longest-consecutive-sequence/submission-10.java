class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0 ) return 0;
        Set<Integer> arraySet = new HashSet<>();
        for(int num : nums){
            arraySet.add(num);
        }
        int maxSeq = 1;
        for( int i = 0; i < nums.length; i++) {
            if(arraySet.contains(nums[i] - 1)){
                continue;
            } 

            int internalSeq = 1;
            int num = nums[i];
            while(arraySet.contains(num+1)){
                internalSeq++;
                num++;
            }

            maxSeq = Math.max(maxSeq, internalSeq);
        }
        return maxSeq;

    }
}

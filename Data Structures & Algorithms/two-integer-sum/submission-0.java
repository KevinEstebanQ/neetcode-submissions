class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> positions = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int complement = target - nums[i];
            if(positions.containsKey(complement)){
                int[] res = {positions.get(complement), i};

                return res;

            } else {

                positions.put(nums[i], i);
            }
        }
        return new int[0];
    }
}

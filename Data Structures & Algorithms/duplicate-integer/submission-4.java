class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        if(nums.length == 0){
            return false;
        }
        for( int i = 0; i<nums.length; i++){
            if (seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
}
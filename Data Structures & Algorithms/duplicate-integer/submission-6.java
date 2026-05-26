class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        if(nums.length == 0){
            return false;
        }
        for(int num: nums){
            if(seen.contains(num)){
                return true;
            } else {
                seen.add(num);
            }
        }
        return false;    }
}
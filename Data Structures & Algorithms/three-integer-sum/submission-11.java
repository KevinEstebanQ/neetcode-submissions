class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int target = -nums[i];
            int l = i + 1, r = nums.length-1;
            while(l < r){
                if((nums[l] + nums[r]) < target) {
                    l++;
                } else if ((nums[l] + nums[r]) > target){
                    r--;
                } else {
                    List<Integer> found = new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r]));
                    if(!seen.contains(found)){
                        ans.add(found);
                    }
                    seen.add(found);
                    l++;
                    r--;
                }
            }

        }
        return ans;

    }
}

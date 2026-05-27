class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prod = 1;
        int zc = 0;
        for(int num : nums){
            if(num != 0){
                prod *= num;
            }
            else {
                zc++;
            }
            
        }
        for( int i = 0; i < nums.length; i ++){
            if (zc > 1) {
                ans[i] = 0;

            } else if (nums[i] == 0){
                ans[i] = prod;
            } else if (zc == 1) {
                ans[i] = 0;
            } else {
                ans[i] = prod/nums[i];
            }
        }
        return ans;
    }
}  

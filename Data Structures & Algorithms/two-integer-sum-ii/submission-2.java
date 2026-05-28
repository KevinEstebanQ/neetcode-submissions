class Solution {
    public static int binarySearch(int left, int right, int target, int[] nums, int curr){

        while(left <= right){
            int middle = (left + right) / 2;
            if((nums[middle] + curr) == target){
                return middle;
            }
            if((nums[middle] + curr) > target){
                right = middle - 1; 
                // [1,2,3,4]
                // [1*,2,3,4] 4 > 3
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        // binary search, alwasy search to the right of index1 as index1 < index2
        // choose middle from i to n, n being len of array.
        // if sum < target serach right of middle, else look left
        // if not found try next in line
        int n = numbers.length - 1;
        for(int i = 0; i < n; i++){
            int index = binarySearch(i, n, target, numbers, numbers[i]);
            if(index != -1) return new int[]{i+1, index+1};
        }
        return new int[2];
    }
}

class Solution {
    public int maxArea(int[] heights) {
        //start from both ends to maximize area, two pointers?
        //max amount of water is min(bar1, bar2) * distance(i2 - i1)
        // move left or right depending on current biggest bar,
        //move to the next bar of the smalles one of the 2
        int maxWater = 0;
        int l= 0,r = heights.length - 1;
        while(l <= r){
            int distance = r - l;
            int lh = heights[l];
            int rh = heights[r];
            maxWater = Math.max(maxWater, Math.min(lh, rh) * distance);
            if(lh < rh){
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        
        int l, r, width, maxArea;
        l = 0; 
        r = heights.length-1;
        maxArea = 0;

        while(l<r){
            width = r-l;
            maxArea = Math.max(maxArea, Math.min(heights[l], heights[r])*width);

            if(heights[l]<=heights[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxArea;

    }
}

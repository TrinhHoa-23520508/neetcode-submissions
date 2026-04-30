class Solution {
    public int maxArea(int[] heights) {

        int maxArea = 0;
        int width;
        for(int i = 0; i<heights.length-1; i++){

            for(int j = i+1; j<heights.length; j++){

                width = j-i;
                maxArea = Math.max(maxArea, Math.min(heights[i], heights[j])*width);
            }
        }
        
        return maxArea;

        
    }
}

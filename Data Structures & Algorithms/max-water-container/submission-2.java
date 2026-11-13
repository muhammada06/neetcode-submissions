class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        int area=0;
        int temp_area;

        while (start<end){
            temp_area=Math.min(heights[start],heights[end])*(end-start);
            if (temp_area>area){
                area=temp_area;
            }

            if (heights[start]<=heights[end]){
                start++;
            }

            else{
                end--;
            }
        }

return area;





         
        
    }
}

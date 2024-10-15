class Solution {
    public int maxArea(int[] heights) {

        int left=0,right=heights.length-1;
        int current_area,max_area=0;

        while(left<right)
        {
            current_area=Math.min(heights[left],heights[right])*(right-left);

            max_area=Math.max(max_area,current_area);

            if(heights[left]<heights[right])
             left++;
            else
             right--;
        }
        return max_area;
        
    }
}

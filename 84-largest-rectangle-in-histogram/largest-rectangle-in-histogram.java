class Solution {
    public int largestRectangleArea(int[] heights) {
        int size=heights.length;
        int []nse=new int[size];
        int []pse=new int[size];
        Arrays.fill(nse,size);
        Arrays.fill(pse,-1);
        int max=0;
        Stack<Integer>st=new Stack<>();
        //finding nse of each element of array
        for(int i=size-1;i>=0;i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
               st.pop();
            if(!st.isEmpty())
               nse[i]=st.peek();
            st.push(i);
        }
        st.clear();
        //finding pse of each element of array
        for(int i=0;i<size;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>heights[i])
               st.pop();
            if(!st.isEmpty())
               pse[i]=st.peek();
            st.push(i);
        }
        int maximum=0;
        for(int i=0;i<size;i++){
            maximum=heights[i]*(nse[i]-pse[i]-1);
            if(maximum>max)
               max=maximum;
        }
        return max;
    }
}

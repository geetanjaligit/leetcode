class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[]nge=new int[n];
        Stack<Integer>st=new Stack<>();
        st.push(n-1);
        nge[n-1]=-1;
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && nums[st.peek()]<nums[i])
                st.pop();
            if(st.size()==0)
                nge[i]=-1;
            else
               nge[i]=st.peek();
            st.push(i);
        }
        int []result=new int[n-k+1];
        for (int i = 0; i <=n-k; i++) {
           int j = i;
           while (nge[j] != -1 && nge[j] < i + k) {
              j = nge[j];
           }
           result[i] = nums[j];
        }
        return result;
    }
}

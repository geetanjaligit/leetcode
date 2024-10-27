class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int [] left_max=new int[n];
        int [] right_max=new int[n];
        int max=0;

        for(int i=0;i<n;i++){
            if(height[i]>=max)
            {
                max=height[i];
                left_max[i]=max;
            }
            else
               left_max[i]=max;
        }
        max=0;
        for(int i=n-1;i>=0;i--){
            if(height[i]>=max)
            {
                max=height[i];
                right_max[i]=max;
            }
            else
               right_max[i]=max;
        }
        int water_trapped=0;
        for(int i=0;i<n;i++)
        {
            water_trapped += Math.min(left_max[i], right_max[i]) - height   [i];

        }
        return water_trapped;

    }
}

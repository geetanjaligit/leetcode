class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        int low=0;
        int high=matrix[0].length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int max=matrix[0][mid];
            int idx=0;
            for(int i=1;i<matrix.length;i++)
            {
                if(max<matrix[i][mid])
                {
                    idx=i;
                    max=matrix[i][mid];
                }
            }
            int left=(mid-1>=0)?matrix[idx][mid-1]:-1;
            int right=(mid+1<matrix[0].length)?matrix[idx][mid+1]:-1;
            if(max>left && max>right) return new int[]{idx, mid};
            else if(max>left) low=mid+1;
            else high=mid-1;
        }
        return new int[]{-1, -1};
    }
}
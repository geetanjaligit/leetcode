class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int l=0,u=m-1;
        while(l<=u)
        {
            int mid=l+(u-l)/2;
            int row=maxElem(mat,n,mid);
            int left_val=mid-1>=0?mat[row][mid-1]:-1;
            int right_val=mid+1<m?mat[row][mid+1]:-1;
            if(mat[row][mid]>left_val && mat[row][mid]>right_val)
               return new int[] {row,mid};
            else if(mat[row][mid]<left_val)
               u=mid-1;
            else if(mat[row][mid]<right_val)
               l=mid+1;
        }
        return  new int[]{-1,-1};
    }
    public int maxElem(int [][]mat,int n,int mid)
    {
        int max=Integer.MIN_VALUE,maxInd=-1;
        for(int i=0;i<n;i++)
        {
            if(mat[i][mid]>max)
            {
                max=mat[i][mid];
                maxInd=i;
            }
        }
        return maxInd;
    }
}
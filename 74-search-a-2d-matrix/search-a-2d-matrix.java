class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0,u=(m*n)-1;
        while(l<=u)
        {
            int mid=l+(u-l)/2;
            int r=mid/m;
            int c=mid%m;
            if(matrix[r][c]==target)
            {
                return true;
            }
            else if(target>matrix[r][c])
            {
                l=mid+1;
            }
            else
            {
                u=mid-1;
            }
        }
        return false;
    }
}
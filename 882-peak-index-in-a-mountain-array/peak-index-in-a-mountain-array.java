class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0,u=arr.length-1;
        int ans=-1;
        while(l<=u)
        {
            int mid=l+(u-l)/2;
            if(arr[mid+1]>arr[mid])
                l=mid+1;
            else
                u=mid-1;
        }
        return l;
    }
}
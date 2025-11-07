class Solution {
    //brute force
    // public int findKthPositive(int[] arr, int k) {
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]<=k)
    //            k++;
    //         else
    //            break;
    //     }
    //     return k;
    // }

    public int findKthPositive(int[] arr, int k) 
    {
        if(k<=arr[0]-1)
           return k;
        int st=0,end=arr.length-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            int num=arr[mid]-(mid+1);
            
            if(num<k)
              st=mid+1;
            else 
              end=mid-1;
        }
        int rem=k-(arr[end]-end-1);
        return arr[end]+rem;
    }
}
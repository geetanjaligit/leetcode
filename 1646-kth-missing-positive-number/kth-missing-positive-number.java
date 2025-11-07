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
        int []nums=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            nums[i]=arr[i]-(i+1);
        }
        int st=0,end=nums.length-1;
        if(k<=nums[0])
           return k;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(nums[mid]<k)
               st=mid+1;
            else
               end=mid-1;
        }
        int remaining=k-nums[end];
        return arr[end]+remaining;
    }
}
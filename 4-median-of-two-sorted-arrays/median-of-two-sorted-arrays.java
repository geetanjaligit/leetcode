class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // List<Integer> list=new ArrayList<>();
        // int i=0,j=0;
        // while(i<nums1.length && j<nums2.length)
        // {
        //     if(nums1[i]<nums2[j]){
        //        list.add(nums1[i]);
        //        i++;
        //     }
        //     else {
        //         list.add(nums2[j]);
        //         j++;
        //     }
        // }
        // while(i<nums1.length)
        // {
        //     list.add(nums1[i]);
        //     i++;
        // }
        // while(j<nums2.length)
        // {
        //     list.add(nums2[j]);
        //     j++;
        // }
        // if(list.size()%2==1)
        //     return list.get(list.size()/2);
        // else
        //     return (list.get(list.size()/2)+list.get(list.size()/2-1))/2.0;


        int n1=nums1.length,n2=nums2.length;
        int i=0,j=0,n=n1+n2;
        int ind2=n/2,ind1=ind2-1;
        int cnt=0;
        int ind1el=-1,ind2el=-1;
        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j])
            {
                if(cnt==ind1)
                   ind1el=nums1[i];
                if(cnt==ind2)
                   ind2el=nums1[i];
                cnt++;
                i++;
            }
            else
            {
                if(cnt==ind1)
                   ind1el=nums2[j];
                if(cnt==ind2)
                   ind2el=nums2[j];
                cnt++;
                j++;
            }
        }
        while(i<n1)
        {
            if(cnt==ind1)
                ind1el=nums1[i];
            if(cnt==ind2)
                ind2el=nums1[i];
            cnt++;
            i++;
        }
        while(j<n2)
        {
            if(cnt==ind1)
                ind1el=nums2[j];
            if(cnt==ind2)
                ind2el=nums2[j];
            cnt++;
            j++;
        }
        if(n%2==1)
            return (double)ind2el;
        else
            return (ind1el+ind2el)/2.0;
    }
}
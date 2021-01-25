import java.util.*;
class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n1=nums1.length;
        int n2=nums2.length;
        int size=n1+n2;
        int arr[]=new int[size];
        int i;
        double median=0.00;
        double x1,x2,req;
        double avg=0.00;
        for(i=0; i<n1; i++)
        {
            arr[i]=nums1[i];
        }
        for(i=0; i<n2; i++)
        {
            arr[n1+i]=nums2[i];
        }
       
        Arrays.sort(arr);
        
        //req=size-1;
        
         if(size%2!=0)
        {
            median=arr[size/2];
        }
        else
        {
            x1=arr[(size)/2];
            x2=arr[size/2-1];
            
            avg=(x1+x2)/2;
            System.out.println(avg);
            
            median=avg;
        }
        
        return median;
        
    }
}
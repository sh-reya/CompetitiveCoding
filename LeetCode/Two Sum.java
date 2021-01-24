class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int i,j;
        int n=nums.length;
        int sol[]=new int [2];
        for(i=0; i<n; i++)
        {
            for(j=i+1; j<n; j++)
        {
            if(nums[i]+nums[j]==target)
            {
                sol[0]=i;
                sol[1]=j;
                break;
            }
        }
        }
        System.out.println("["+sol[0]+","+sol[1]+"]");
        return sol;
        
    }
   
}
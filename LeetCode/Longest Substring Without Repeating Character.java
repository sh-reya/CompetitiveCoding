import java.util.*;
class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int n=s.length();
        int i,j,max=0;
        for(i=0; i<n; i++)
        {
            boolean visited[]=new boolean[256];
            for(j=i; j<n; j++)
            {
                if(visited[s.charAt(j)]==true)
                {
                    break;
                }
                else
                {
                    max=Math.max(max,j-i+1);
                    visited[s.charAt(j)]=true;
                }
            }
            visited[s.charAt(i)]=false;
        }
        return max;
    }
}
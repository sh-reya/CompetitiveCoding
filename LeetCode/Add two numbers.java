/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode sol=null;
        ListNode temp=null;
        ListNode prev=null;
        int carry=0;
        int sum;
        
        while(l1!=null || l2!=null)
        {
           // sum=carry+(l1!=null ? l1.data : 0)+(l2!=null ? l2.data : 0);
            sum = carry + (l1 != null ? l1.val : 0)
                  + (l2 != null ? l2.val : 0);
            carry=sum>=10?1:0;
            sum=sum%10;
            
            //operation completes. Now we store the data in a LL
            
            temp=new ListNode(sum);
            if(sol==null)
            {
                sol=temp;
            }
            else
            {
                prev.next=temp;
            }
            
            //Moving pointers for next iteration
            prev=temp;
            if(l1!=null)
            {
                l1=l1.next;
            }
            if(l2!=null)
            {
                l2=l2.next;
            }
            
           
            
            
        }
         if(carry>0)
            {
                temp.next=new ListNode(carry);
                
             
            }
       
         return sol;
    }
    
}
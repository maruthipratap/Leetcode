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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //if(l1==null && l2==null)return  null;
        ListNode res=new ListNode(-1);
        ListNode temp=res;
        int x=0;
        while(l1!=null || l2!=null){
            int a=(l1!=null)?l1.val:0;
            int b=(l2!=null)?l2.val:0;
            int sum=a+b+x;

            temp.next=new ListNode(sum%10);
            x=sum/10;
            temp=temp.next;
            if(l1!=null)l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(x!=0){
            temp.next=new ListNode(x);
        }
        return res.next;
    }
}
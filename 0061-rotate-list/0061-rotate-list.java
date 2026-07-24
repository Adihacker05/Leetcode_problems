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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null)
        {
            return head;
        }
        ListNode tail=head;
        int len=1;
        while(tail.next!=null)
        {
            tail=tail.next;
            len+=1;
        }
        if(k%len==0)
        {
            return head;
        }
        k=k%len;
        tail.next=head;
        ListNode newNode=head;
        int count=len-k-1;
        while(count!=0)
        {
            newNode=newNode.next;
            count-=1;
        }
        head=newNode.next;
        newNode.next=null;
        return head;
    }
}
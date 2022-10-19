//iterative method
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }
}
//recursive method
class Solution {
    public ListNode reverseList(ListNode head) {
       if(head==null||head.next==null)return head;
        ListNode res=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return res;
    }
}

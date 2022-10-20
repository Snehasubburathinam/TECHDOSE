class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res=new ListNode(-1);
        res.next=head;
        ListNode ptr=res;
        while(ptr!=null){
            ListNode temp=ptr;
            for(int i=0;i<k && temp!=null;i++){
                temp=temp.next;
            }
            if(temp==null) break;
            ListNode cur=ptr.next;
            ListNode prev=null;
            ListNode next=ptr.next.next;
            for(int i=0;i<k;i++){
                next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
            }
            ListNode tail=ptr.next;
            tail.next=cur;
            ptr.next=prev;
            ptr=tail;
        }
        return res.next;
    }
}

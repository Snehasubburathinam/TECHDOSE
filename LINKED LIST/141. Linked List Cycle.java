public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> res=new HashSet<>();
        while(head!=null){
            if(res.contains(head)){
                return true;
            }
            res.add(head);
            head=head.next;
        }
        return false;
    }
}

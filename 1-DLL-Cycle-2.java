public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> neu = new HashMap<>();
        while(head!=null){
            if(neu.containsKey(head))return head;
            neu.put(head, head.val);
            head = head.next;
        }
        return null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slo = head;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slo = slo.next;
            if(slo==fast)return true;
        }

        return false;
    }
}

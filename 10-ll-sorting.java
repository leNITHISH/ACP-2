class Solution {
    public ListNode sortList(ListNode head) {
        for(ListNode i = head; i!=null; i = i.next){
            ListNode min = i;
            for(ListNode j = i.next; j!=null; j = j.next)
                if(j.val<min.val)min = j;

            int t = i.val;
            i.val = min.val;
            min.val = t;
        }    
        return head;
    }

}

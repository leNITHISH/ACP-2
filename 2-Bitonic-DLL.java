class Solution {
    public ListNode sortBitonicList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode p = head;
        while (p.next != null && p.val <= p.next.val) p = p.next;

        ListNode b = p.next;
        p.next = null;
        if (b != null) b.prev = null;

        b = rev(b);
        return merge(head, b);
    }

    ListNode rev(ListNode h) {
        for (ListNode c = h, t; c != null; ) {
            t = c.prev;
            c.prev = c.next;
            c.next = t;
            h = c;
            c = c.prev;
        }
        return h;
    }

    ListNode merge(ListNode a, ListNode b) {
        ListNode d = new ListNode(), t = d;
        while (a != null && b != null) {
            if (a.val <= b.val) { t.next = a; a.prev = t; a = a.next; }
            else { t.next = b; b.prev = t; b = b.next; }
            t = t.next;
        }
        t.next = (a != null) ? a : b;
        if (t.next != null) t.next.prev = t;
        d.next.prev = null;
        return d.next;
    }
}

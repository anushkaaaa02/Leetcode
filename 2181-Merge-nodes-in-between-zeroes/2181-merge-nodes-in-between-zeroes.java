class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode ans = head;
        int sum = 0;

        while (curr != null) {
            if (curr.val == 0) {
                ans = ans.next = new ListNode(sum);
                sum = 0;
            } else {
                sum += curr.val;
            }

            curr = curr.next;
        }

        ans.next = null;
        return head.next;
    }
}
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode before = list1;
        
        for (int i = 0; i < a - 1; i++) {
            before = before.next;
        }

        ListNode after = before;
        
        for (int i = a - 1; i <= b; i++) {
            after = after.next;
        }

        before.next = list2;

        while (list2.next != null) {
            list2 = list2.next;
        }

        list2.next = after;

        return list1;
    }
}
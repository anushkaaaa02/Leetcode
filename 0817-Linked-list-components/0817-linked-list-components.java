class Solution {
    public int numComponents(ListNode head, int[] nums) {
        boolean[] present = new boolean[10001];

        for (int x : nums) {
            present[x] = true;
        }

        int count = 0;

        while (head != null) {
            if (present[head.val] && 
                (head.next == null || !present[head.next.val])) {
                count++;
            }
            head = head.next;
        }

        return count;
    }
}
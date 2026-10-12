package DAA.week3.intersection;

public class ListNode {
    int val;
    DAA.week3.removeDuplicates.ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, DAA.week3.removeDuplicates.ListNode next) {
        this.val = val;
        this.next = next;
    }
}
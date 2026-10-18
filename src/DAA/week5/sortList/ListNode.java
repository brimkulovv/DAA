package DAA.week5.sortList;

public class ListNode {
    int val;
    DAA.week5.sortList.ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, DAA.week5.sortList.ListNode next) {
        this.val = val;
        this.next = next;
    }
}
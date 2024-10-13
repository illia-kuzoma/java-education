package com.wellnessliving.lesson2.ReverseLinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);
        printList(reversedHead);

        ListNode head2 = new ListNode(1, new ListNode(2));
        Solution solution2 = new Solution();
        ListNode reversedHead2 = solution2.reverseList(head2);
        printList(reversedHead2);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

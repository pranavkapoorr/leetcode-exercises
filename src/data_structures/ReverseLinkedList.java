package data_structures;


public class ReverseLinkedList {

    private ListNode addToList(ListNode head, int data){
        ListNode newNode = new ListNode();
        newNode.val = data;
        newNode.next = null;
        ListNode existingLastNode = head;
        while(existingLastNode.next!=null){
            existingLastNode = existingLastNode.next;
        }
        existingLastNode.next = newNode;
        return head;
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private void printAll(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print("| " + temp.val  + " |");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ReverseLinkedList helper = new ReverseLinkedList();
        helper.addToList(head, 10);
        helper.addToList(head, 20);
        helper.addToList(head, 30);
        helper.addToList(head, 40);
        helper.printAll(head);
        System.out.println();
        head = helper.reverseList(head);
        helper.printAll(head);
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

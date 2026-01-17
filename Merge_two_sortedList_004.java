public class Merge_two_sortedList_004 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node mergeList(Node head1 , Node head2){
        Node dummy = new Node(-1);
        Node tail = dummy;
    }
    public static void main(String[] args) {
        // Creating first sorted linked list
        Node head1 = new Node(11);
        head1.next = new Node(14);
        head1.next.next = new Node(17);

        // Creating second sorted linked list
        Node head2 = new Node(12);
        head2.next =new Node(17);
        head2.next.next = new Node(18);

        Node mergedHead = mergeList(head1, head2);
    }
}

public class Merge_two_sortedList_004 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // Method to merge two sorted linked lists
    public static Node mergeList(Node head1 , Node head2){
        Node dummy = new Node(-1);
        Node tail = dummy;
        while(head1 !=null && head2 !=null){
            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }
            else{
                tail.next = head2;
                head2= head2.next;
        }
             tail = tail.next;
    }
    // Append remaining nodes of list1, if any
    if(head1 !=null){
        tail.next = head1;
    }
    else{
        tail.next = head2;
    }
    return dummy.next;// Return the head of the merged list
}
//print method to display the linked list
public static void printList(Node head){
    Node current = head;
    while(current != null){
        System.out.println(current.data +" -> ");
        current = current.next;
    }
}
    public static void main(String[] args) {
        // Creating first sorted linked list
        Node head1 = new Node(11);
        head1.next = new Node(14);
        head1.next.next = new Node(17);

        // Creating second sorted linked list
        Node head2 = new Node(12);
        head2.next =new Node(13);
        head2.next.next = new Node(17);

        Node mergedHead = mergeList(head1, head2);
        printList(mergedHead);
    }
}

package LinkedList.EasyProblems;


public class InsertAtHead {
    static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        Node temp=head;
        newNode.next = temp;
        head = newNode;
        return newNode;
    }
    static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("");  // for new line after printing the list.
    }

    public static void main(String[] args){
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(7);
        System.out.println("Original Linked List:");
        printList(head);

        head = insertAtHead(head, 9);
        System.out.println("After inserting 9 at the head:");
        printList(head);
    }

}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
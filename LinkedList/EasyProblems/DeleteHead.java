package LinkedList.EasyProblems;


public class DeleteHead {
    
    static Node deleteHead(Node head){
        if(head == null) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    static void printLL(Node head){
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printLL(head);

        head = deleteHead(head);

        System.out.println("\nAfter deleting head:");
        printLL(head);
    }
    
}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
package LinkedList.EasyProblems;

public class InsertAtEnd {
    static Node insertAtEnd(Node head,int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null) return newNode;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static void printList(Node head){
        Node temp = head;
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

        head = insertAtEnd(head, 9);
        System.out.println("After inserting 9 at the head:");
        printList(head);

        System.out.println("Original Linked List:");
     
        Node head1=null;
        printList(head1);

        head1=insertAtEnd(head1, 5);
        System.out.println("Linked List adding 5:");
        printList(head1);
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

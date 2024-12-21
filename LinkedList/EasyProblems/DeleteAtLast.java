package LinkedList.EasyProblems;

public class DeleteAtLast {
    
    static Node deleteAtLast(Node head){
        if(head==null) return null;
        if(head.next==null) return null;
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
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
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);
        System.out.println("Original Linked List:");
        printLL(head);

        head = deleteAtLast(head);
        System.out.println("After deleting last node:");
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
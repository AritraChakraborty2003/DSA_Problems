package LinkedList.EasyProblems;

public class LengthOfLL {
    
    static int length(Node head) {
        int count = 0;
        Node current = head;
        while(current!= null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next= new Node(6);
        int len = length(head);
        System.out.println("Length of the linked list is: " + len);
    }
    
}


class Node{
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}
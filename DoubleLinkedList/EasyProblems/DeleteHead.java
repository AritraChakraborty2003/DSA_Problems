package DoubleLinkedList.EasyProblems;

public class DeleteHead {
    static Node DeleteHeadNode(Node head) {
        if(head == null) return null;
        Node temp = head;
        head = head.next;
 
        temp.next = null;

        if(head!=null) head.prev=null;
        return head;
    }
    static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.prev=null;
        head.next = new Node(2,new Node(3),head);

        System.out.println("Original Doubly Linked List:");
        printLL(head);
        head = DeleteHeadNode(head);
        System.out.println("After Deleting the Head Node:");
        printLL(head);
    }
}


class Node{
    int data;
    Node prev, next;

    Node(int data){
        this.data = data;
        this.prev = this.next = null;
    }
    Node(int data, Node next,Node prev){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
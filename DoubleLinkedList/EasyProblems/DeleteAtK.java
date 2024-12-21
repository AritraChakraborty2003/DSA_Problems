package DoubleLinkedList.EasyProblems;

public class DeleteAtK {
    static Node DeleteHeadNode(Node head) {
        if(head == null || head.next==null) return null;
        Node temp = head;
        head = head.next;
 
        temp.next = null;

        head.prev=null;
        return head;
    }

    static Node deleteTailNode(Node head) { 
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.prev.next=null;
        temp.next=null;
        
        return head;
    }
    static Node deleteNodeAtK(Node head, int k) {
        // Write your code here.
        Node temp=head;
        int cnt=0;
        if(temp==null) return null;
        while(temp!=null){
            cnt++;
            if(cnt==k) {
                break;
            }
            temp=temp.next;
        }
        Node next=temp.next;
        Node prev=temp.prev;

        if(next==null && prev==null) return null;
        if(prev==null) {
           return  DeleteHeadNode(head);
        }
        if(next==null){
           return  deleteTailNode(head);
        }
        prev.next=next;
        next.prev=prev;

        temp.next=null;
        temp.prev=null;
        return head;

    }

    static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("");
    }



    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev=head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original Doubly Linked List:");
        printList(head);
        head = deleteNodeAtK(head, 4);
        System.out.println("After Deleting Node at Kth position:");
        printList(head);
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
    

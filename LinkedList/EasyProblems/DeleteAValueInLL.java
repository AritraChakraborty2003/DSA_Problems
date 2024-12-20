package LinkedList.EasyProblems;

public class DeleteAValueInLL {
    

    static Node deleteNode(Node head, int key) {
        Node temp=head;
        if(head==null) return null;
        if(head.data==key) {
            head=head.next;
            temp.next=null;
            return head;
        }
        Node prev=null;
        while(temp!=null){
            if(temp.data==key){
                prev.next=prev.next.next;
                temp.next=null;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    static void printList(Node head) {

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("");
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(11);
        System.out.println("Original Linked List");
        printList(head);
        System.out.println("After deleting 11");
        head = deleteNode(head, 11);
        printList(head);
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

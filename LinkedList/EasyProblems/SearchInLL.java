package LinkedList.EasyProblems;

public class SearchInLL {

    static void printLL(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static boolean search(Node head, int key){
        Node temp = head;
        while(temp!= null){
            if(temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(6);
        head.next = new Node(8);
        head.next.next = new Node(3);
        head.next.next.next = new Node(7);

        int key = 1;
        int key1= 3;

        System.out.print("Original Linked List: ");
        printLL(head);

        System.out.println("Element "+key+" found in LinkedList: "+search(head, key));
        System.out.println("Element "+key1+" found in LinkedList: "+search(head, key1));
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

package LinkedList.EasyProblems;

public class InsertAtK {
    static Node insertAtK(Node head,int data,int k){
        Node newNode = new Node(data);
        if(head==null){
   
            if(k==1)
            {
                return newNode;
            }
            else return null;
        }
        if(k==1){
            newNode.next=head.next;
            head=newNode;
            return head;
        }
        int cnt=0; Node temp=head;
        while(temp!=null){
            cnt++;
            if(cnt==k-1){
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(7);
        head.next=new Node(8);
        head.next.next=new Node(9);
        head.next.next.next=new Node(10);
        head.next.next.next.next=new Node(11);
        System.out.println("Original Linked List:");
        printLL(head);
        System.out.println("After inserting 3 at k=3:");
        head=insertAtK(head, 3, 3);
        printLL(head);

        Node head1=null;
        System.out.println("Original Linked List:");
        printLL(head1);
        System.out.println("After inserting 3 at k=3:");
        head1=insertAtK(head1, 3, 3);
        printLL(head1);
        System.out.println("After inserting 1 at k=1:");
        head1=insertAtK(head1, 1, 1);
        printLL(head1);
      
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

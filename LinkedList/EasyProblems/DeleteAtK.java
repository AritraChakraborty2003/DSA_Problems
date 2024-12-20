package LinkedList.EasyProblems;

public class DeleteAtK {


 static void printLL(Node head){
    Node temp=head;
    while(temp!= null){
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    System.out.println("null");
    System.out.println("");
    
 }
 static Node deleteAtK(Node head, int k){
      Node temp=head;
      if(temp==null) return null;
      if(k==1) {
        head=head.next;
        temp.next=null;
        return head;
      }
      int cnt=0;
      Node prev=null;
      while(temp!=null){
        cnt++;
        if(cnt==k){
          prev.next=prev.next.next;
          temp.next=null;
          break;
        }
        prev=temp;
        temp=temp.next;
      }
      return head;
    }
    public static void main(String[] args) {
      Node head=new Node(3);
      head.next = new Node(5);
      head.next.next = new Node(7);
      head.next.next.next = new Node(9);
      head.next.next.next.next = new Node(11);
      System.out.println("Original Linked List:");
      printLL(head);
      System.out.println("After Deleting at k=1");
      head=deleteAtK(head, 1);
      printLL(head);
      System.out.println("After Deleting at k=3");
      head=deleteAtK(head, 3);
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

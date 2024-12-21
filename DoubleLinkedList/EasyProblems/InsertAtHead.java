package DoubleLinkedList.EasyProblems;

import java.util.ArrayList;

public class InsertAtHead {

    static Node insertAtHead(Node head,int data){
        Node newNode = new Node(data);
        Node temp=head;
        if(head == null) return newNode;
        newNode.next = temp;
        newNode.prev = null;
        temp.prev=head;
        head=newNode;
        return head;

    }

    static Node Convert2DLL(ArrayList<Integer> arr){
        Node head=new Node(arr.get(0));
        Node prev=head;
        for(int i=1;i<arr.size();i++){
            Node newNode=new Node(arr.get(i),null,prev);
            prev.next=newNode;
            prev=newNode;
        }
        return head;
    }
    static void printLL(Node head){
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("");
       
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Node head=Convert2DLL(list);
        System.out.println("Original Doubly Linked List:");
        printLL(head);
        
        System.out.println("After Insertion at Head 9:");
        head=insertAtHead(head, 9);
        printLL(head);

        System.out.println("After Insertion at Head 7:");
        head=insertAtHead(head, 7);
        printLL(head);

        System.out.println("After Insertion at Head 6:");
        head=insertAtHead(head, 6);
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
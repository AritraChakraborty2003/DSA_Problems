package DoubleLinkedList.EasyProblems;

import java.util.ArrayList;

public class Convert2DLL {


    static Node convert2DLL(ArrayList<Integer> arr) {
        if(arr.isEmpty()) return null;
        Node head = new Node(arr.get(0));
        Node prev = head;
        for(int i=1;i<arr.size();i++){
            // Node newNode = new Node(arr.get(i),null,prev);
            // prev.next = newNode;
            // prev = newNode;

            Node newNode = new Node(arr.get(i));
            newNode.prev = prev;
            newNode.next = null;
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }

    static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("");
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

       
        System.out.println("Original List:");
        System.out.println(arr);
        Node head = convert2DLL(arr);
        System.out.println("Converted Doubly Linked List:");
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

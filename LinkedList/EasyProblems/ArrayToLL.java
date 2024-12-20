package LinkedList.EasyProblems;

import java.util.ArrayList;

public class ArrayToLL {
    
    static Node Array2LL(ArrayList<Integer> arr){

        Node temp = new Node(arr.get(0));
        Node mover=temp;
        for(int i=1;i<arr.size();i++){
            mover.next = new Node(arr.get(i));
            mover = mover.next;
        }
        return temp;
    }

    static void printLL(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        arr.add(3);

        Node head=Array2LL(arr);
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
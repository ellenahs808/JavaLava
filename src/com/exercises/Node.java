package com.exercises;

public class Node {

//    private Node head;
//    private Node tail;
    private Node next;
    private int data;


    Node(int data) {
        this.data = data;
    }


    //getters
//    public Node getHead() { return head; }
//    public Node getTail() { return tail; }
    public Node getNext() { return next; }
    public int getData() { return data; }


    //setters
//    public void setHead(Node node) { head = node; }
//    public void setTail(Node node) { tail = node; }
    public void setNext(Node node) { next = node; }
    public void setData(int d) { data = d; }


    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(18);

//        System.out.println(n1.getData());
//        System.out.println(n2.getData());
//        System.out.println(n3.getData());


        n2.add(n1);  // n2 = 10, 5

        System.out.println(n2.getData());  // prints: 10
        System.out.println(n2.getNext().getData());  // prints 5

        System.out.println(n3.getData());  // prints 18

    }


    public void add(Node node) {
        next = node;
    }

}

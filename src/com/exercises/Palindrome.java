//package com.exercises;
//
//import java.util.*;
//
//import java.util.ArrayList;
//
//public class Palindrome {
//
//    public static void main(String[] args) {
//        Node n1 = new Node(10);
//        Node n2 = new Node(5);
//        Node n3 = new Node(8);
//        Node n4 = new Node(6);
//        Node n5 = new Node(10);
//
//        //built in method is 'next'
//        n1.setNext(n2);
//        n2.setNext(n3);
//        n3.setNext(n4);
//        n4.setNext(n5);
//
//        System.out.println(n1.getData());
//    }
//
//
//    public static boolean isPrime(Node head) {
//        ArrayList<Integer> stack = new ArrayList<>();
//
//        Node currentNode = head;
//        while (currentNode != null) {
//            stack.push(currentNode);
//            currentNode = currentNode.next;  // reassigning currentNode to the next Node value
//        }
//
//        //reassigning currentNode back to the Node head value
//        currentNode = head;
//        int lastNum;
//        while (currentNode != null) {
//            lastNum = stack.pop();
//            if (lastNum != currentNode.data) {  // if the top number on the stack does not equal to the bottom number on the stack
//                return false;
//            }
//            currentNode = currentNode.next;
//        }
//
//        return true;
//    }
//
//    public static class Node {
//
//    //    private Node head;
//    //    private Node tail;
//        private Node next;
//        private int data;
//
//
//        Node(int data) {
//            this.data = data;
//        }
//
//
//        //getters
//    //    public Node getHead() { return head; }
//    //    public Node getTail() { return tail; }
//        public Node getNext() { return next; }
//        public int getData() { return data; }
//
//
//        //setters
//    //    public void setHead(Node node) { head = node; }
//    //    public void setTail(Node node) { tail = node; }
//        public void setNext(Node node) { next = node; }
//        public void setData(int d) { data = d; }
//
//
//        public static void main(String[] args) {
//            Node n1 = new Node(5);
//            Node n2 = new Node(10);
//            Node n3 = new Node(18);
//
//    //        System.out.println(n1.getData());
//    //        System.out.println(n2.getData());
//    //        System.out.println(n3.getData());
//
//
//            n2.add(n1);  // n2 = 10, 5
//
//            System.out.println(n2.getData());  // prints: 10
//            System.out.println(n2.getNext().getData());  // prints 5
//
//            System.out.println(n3.getData());  // prints 18
//
//        }
//
//
//        public void add(Node node) {
//            next = node;
//        }
//
//    }
//}

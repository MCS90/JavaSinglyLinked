package com.company;

public class MyLinkedList<T> {
    private Node head, tail;

    public void appendNode(T data) {
        if(head == null) {
            head = new Node(data);
            return;
        }
        tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = new Node(data);

    }
    public void prepend(T data) {
        // 5 > 3 > 9 want to prepend 10
        Node prevHead = head;
        head = new Node(data);
        head.next = prevHead;
//        System.out.println("head: " + head.data);
//        System.out.println("prev:" + prevHead.data);
    }

    public void print() {
        Node n;
        n = head;
        while(n != null){
            System.out.println(n.data);
            n=n.next;
        }
    }

    class Node<T> {
        private T data;
        private Node next;
        public Node(T data){
            this.data = data;
        }
    }
}

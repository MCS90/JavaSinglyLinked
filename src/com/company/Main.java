package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedList<Integer> mylist = new MyLinkedList<Integer>();
        mylist.appendNode(5);
        mylist.appendNode(6);
        mylist.appendNode(23);
        mylist.appendNode(104);
        mylist.appendNode(107);
        mylist.prepend(10);
        mylist.print();
    }
}

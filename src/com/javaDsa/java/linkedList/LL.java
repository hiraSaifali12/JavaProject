package com.javaDsa.java.linkedList;

public class LL {

    private Node head;
    private Node tail ;
    private int size;

    LL(){
        head=tail=null;
        size=0;

    }
    public void addFirst(int data){
    Node newVal = new Node(data);
    newVal.next=head;
    head=newVal;
    if(size==0){
        tail=newVal;

    }
    newVal.next=head;
    head = newVal;
    size++;

    }
    public void addLast(int data) {
        Node newVal= new Node(data);
        if(size==0){
            head=tail=newVal;
        }
        tail.next=newVal;
        tail=tail.next;
        tail.next = null;
        size++;
    }
    public void addAt(int data , int idx){

    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("LL.display");
    }

}


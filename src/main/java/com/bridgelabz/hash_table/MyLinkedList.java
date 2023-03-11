package com.bridgelabz.hash_table;

public class MyLinkedList<K> {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {

        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            head.setNext(tempNode);
        }
    }

    public void append(INode myNode) {
        if (this.tail == null) {
            this.tail = myNode;
        }
        if (this.head == null) {
            this.head = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public INode search(K key) {
        if (this.head == null) {
        } else {
            INode tempNode = head;
            while (!tempNode.equals(this.tail)) {
                if (tempNode.getKey().equals(key)) {
                    return tempNode;
                } else {
                    tempNode = tempNode.getNext();
                }
            }
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "MyLinkedList{" + head + '}';
    }
}

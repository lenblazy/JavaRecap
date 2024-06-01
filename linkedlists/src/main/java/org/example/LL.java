package org.example;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int idx) {
        if (idx == 0) {
            insertFirst(val);
            return;
        }

        if (idx == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < idx; i++){
            temp = temp.next;
        }

        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;

    }

    public void insertRec(int val, int idx){
        head = insertRec(val, idx, head);
    }

    private Node insertRec(int val, int index, Node node){
        if (index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index- 1, node.next);
        return node;
    }

    public Node get(int idx) {
        Node temp = head;
        for(int i = 0; i < idx; i++){
            temp = temp.next;
        }
        return temp;
    }

    public int delete(int idx) {
        if (idx == 0) {
            return deleteFirst();
        }

        if (idx == size - 1) {
            return deleteLast();
        }

        Node prev = get(idx - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteLast() {
        if (size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;

    }

    public void display() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}

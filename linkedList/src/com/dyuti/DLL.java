package com.dyuti;

public class DLL {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse:");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public Node find(int val){
        Node node = head;
        while(node!= null){
            if(node.val == val) return node;
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val){
        Node node = new Node(val);
        Node p = find(after);
        if(p==null){
            System.out.println("Does nit exist");
            return;
        }
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev = node;
        }
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

package project1A;

import proj1b.Deque;

import java.awt.*;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/4/9
 *  Last updated:  2018/4/9
 *  Compilation:   javac LinkedListDeque.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class LinkedListDeque<T> implements Deque<T> {

    public class Node {
        private Node prev;
        private T item;
        private Node next;

        public Node(Node prev, T item, Node next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    private Node sentinel;

    private int size = 0;

    public LinkedListDeque() {
        sentinel = new Node(this.sentinel, null, this.sentinel);
        this.size = 0;
    }

    /**
     * Adds an item of type T to the front of the deque
     * @param item
     */
    @Override
    public void addFirst(T item) {
        Node newFirstNode;

        if (isEmpty()) {
            newFirstNode = new Node(this.sentinel, item, this.sentinel);
            this.sentinel.prev = newFirstNode;
        } else {
            Node oldFirstNode = this.sentinel.next;
            newFirstNode = new Node(this.sentinel, item, oldFirstNode);
        }
        this.sentinel.next = newFirstNode;
        this.size++;
    }

    /**
     * Adds an item of type T to the back of the deque
     * @param item
     */
    @Override
    public void addLast(T item) {
        Node newLastNode;

        if (isEmpty()) {
            newLastNode = new Node(this.sentinel, item, this.sentinel);
            this.sentinel.next = newLastNode;
        } else {
            Node oldLastNode = this.sentinel.prev;
            newLastNode = new Node(oldLastNode, item, this.sentinel);
            oldLastNode.next = newLastNode;
        }
        this.sentinel.prev = newLastNode;
        this.size++;
    }

    /**
     * Return true if deque is empty false otherwise
     * @return
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Return the number of items in the deque
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Prints the items in the deque from first to last, separated by a space
     */
    @Override
    public void printDeque() {
        Node p = this.sentinel.next;

        while (p != sentinel) {
            System.out.println(p.item + " ");
            p = p.next;
        }
    }

    /**
     * Removes and returns the item at the front of the deque.
     * If no such item exists, returns null
     * @return
     */
    @Override
    public T removeFirst() {
        T first;

        Node oldFirstNode = this.sentinel.next;
        first = oldFirstNode.item;

        this.sentinel.next = oldFirstNode.next;
        oldFirstNode.next.prev = this.sentinel;

        this.size--;
        oldFirstNode = null;

        return first;
    }

    /**
     * Removes and returns the item at the back of the deque.
     * If no such item exists, returns null.
     * @return
     */
    @Override
    public T removeLast() {
        T last;

        Node oldLastNode = this.sentinel.prev;
        last = oldLastNode.item;

        this.sentinel.prev = oldLastNode;
        oldLastNode.prev.next = this.sentinel;

        this.size--;
        oldLastNode = null;

        return last;
    }

    /**
     * Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth.
     * If no such item exists, returns null. Must not alter the deque!
     * @param index
     * @return
     */
    @Override
    public T get(int index) {
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException("index must lsee then size or more the 0");
        }

        Node p = this.sentinel.next;

        int count = 0;

        while (count != index) {
            p = p.next;
            count ++;
        }

        return p.item;
    }


    public static void main(String[] args) {
        LinkedListDeque<Integer> linkedListDeque = new LinkedListDeque<>();

        linkedListDeque.addFirst(1);
        linkedListDeque.addFirst(2);
        linkedListDeque.addFirst(3);
        linkedListDeque.addFirst(4);
        linkedListDeque.addLast(5);
        linkedListDeque.addLast(6);
        linkedListDeque.addLast(7);
        linkedListDeque.addLast(8);
        linkedListDeque.printDeque();

    }
}

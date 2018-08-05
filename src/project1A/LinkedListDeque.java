package project1A;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/4/9
 *  Last updated:  2018/4/9
 *  Compilation:   javac LinkedListDeque.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class LinkedListDeque<T> {

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
        size = 0;
        sentinel = new Node(sentinel, null, sentinel);
    }

    /**
     * Adds an item of type T to the front of the deque
     * @param item
     */
    public void addFirst(T item) {
        Node newFrontNode;
        if (size == 0) {
            newFrontNode = new Node(this.sentinel, item, this.sentinel);
            this.sentinel.prev = newFrontNode;
        } else {
            Node oldFrontNode = this.sentinel.next;
            newFrontNode = new Node(this.sentinel, item, oldFrontNode);
        }
        this.sentinel.next = newFrontNode;
        this.size += 1;
    }

    /**
     * Adds an item of type T to the back of the deque
     * @param item
     */
    public void addLast(T item) {
        Node newEndNode;

        if (this.size == 0) {
            newEndNode = new Node(this.sentinel, item, this.sentinel);
            this.sentinel.next = newEndNode;
        } else {
            Node oldEndNode = this.sentinel.next;
            newEndNode = new Node(oldEndNode, item, this.sentinel);
            oldEndNode.next = newEndNode;
        }
        this.sentinel.prev = newEndNode;
        this.size += 1;
    }

    /**
     * Return true if deque is empty false otherwise
     * @return
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Return the number of items in the deque
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * Prints the items in the deque from first to last, separated by a space
     */
    public void printDeque() {
        Node p = sentinel.next;

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
    public T removeFirst() {
        return null;
    }

    /**
     * Removes and returns the item at the back of the deque.
     * If no such item exists, returns null.
     * @return
     */
    public T removeLast() {
        return null;
    }

    /**
     * Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth.
     * If no such item exists, returns null. Must not alter the deque!
     * @param index
     * @return
     */
    public T get(int index) {
        return null;
    }





}

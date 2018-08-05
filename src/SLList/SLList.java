package SLList;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/4/9
 *  Last updated:  2018/4/9
 *  Compilation:   javac SLList.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;
    private int size;
    private SLList sentinel;

    public SLList() {
        first = null;
        size = 0;
    }

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
        size += 1;
    }

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        IntNode p = first;
        if (p == null) {
            this.first = new IntNode(x, null);
            return;
        }

        /* Advance p to the end of the list. */
        while (p !=null && p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Crashes when you call addLast on an empty SLList. Fix it. */
    public static void main(String[] args) {
        SLList x = new SLList();
        x.addLast(5);
        x.addLast(10);
        x.addLast(15);
        System.out.println(x.getFirst());
    }
}

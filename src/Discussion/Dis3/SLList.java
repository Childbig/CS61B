package Discussion.Dis3;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/6/6
 *  Last updated:  2018/6/6
 *  Compilation:   javac SLList.java
 *  Description: 
 *
 ******************************************************************************/


public class SLList {
    private static class IntNode {
        private int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private IntNode first;

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public void insert(int item, int position) {
        if (position == 0 || first == null) {
            addFirst(item);
            return;
        }

        IntNode currentNode = first;

        while (position > 1 && currentNode.next != null) {
            position--;
            currentNode = currentNode.next;
        }
        IntNode newNode = new IntNode(item, currentNode.next);
        currentNode.next = newNode;

    }

    public void reverseIter() {
        IntNode frontOfReversed = null;
        IntNode nextOfReversed = first;

        while (nextOfReversed != null) {
            IntNode remaidOfReversed = nextOfReversed.next;
            nextOfReversed.next = frontOfReversed;

            frontOfReversed = nextOfReversed;
            nextOfReversed = remaidOfReversed;

        }
        first = frontOfReversed;

    }

    public void revertse() {
        first = revertRecursion(first);
    }

    public IntNode revertRecursion(IntNode front) {
        if (front.next == null || front == null) {
            return front;
        }

        IntNode revertNode = revertRecursion(front.next);
        front.next.next = front;
        front.next = null;
        return  revertNode;

    }


    public static void main(String[] args) {
        SLList testIntNode = new SLList();
        testIntNode.addFirst(5);
        testIntNode.addFirst(10);
        testIntNode.addFirst(15);
        testIntNode.addFirst(20);
        testIntNode.reverseIter();
        testIntNode.revertse();
        testIntNode.insert(6, 2);
    }
}


import java.util.EmptyStackException;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/1/27
 *  Last updated:  2019/1/27
 *  Compilation:   javac ListStack.java
 *  Description: 
 *
 ******************************************************************************/


public class ListStack {
    int value;
    int size;
    ListStack next;

    public ListStack (int add) {
        this.size = 1;
        this.value = add;
        this.next = null;
    }

    public void push (int add) {
        this.next = this;
        this.value = add;
        this.size++;
    }

    public int pop() {
        if (this.size == 0) { throw new EmptyStackException(); }
        int i = this.value;
       // this = this.next;
        this.size--;
        return i;
    }

    public int size() {
        return this.size;
    }

    public int peek() {
        return this.value;
    }

    public static void main(String[] args) {
        int a = 1;

        if (1 == 2)
            System.out.println(a);
        else
            System.out.println(a);
            System.out.println(a + 1);
        System.out.println(a);
        if (1 == 2)
            System.out.println("1");
        else
            System.out.println("2");
                System.out.println("1");
        System.out.println("3");
       /* ListStack a = new ListStack(5);
        System.out.println(a.size()); //prints 1
        System.out.println(a.peek()); //prints 5
        a.push(4);
        System.out.println(a.size()); //prints 2
        System.out.println(a.peek()); //prints 4
        a.push(6);
        System.out.println(a.size()); //prints 3
        System.out.println(a.peek()); //prints 6
        a.push(1);
        System.out.println(a.size()); //prints 4
        System.out.println(a.peek()); //prints 1*/
    }
}

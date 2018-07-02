package IntList;

/*----------------------------------------------------------------
 *  Author:        Zhang Xuan
 *  Written:       2018/4/9
 *  Last updated:  2018/4/9
 *  Compilation:   javac IntList.java
 *  Execution:     java HelloWorld
 *  Description: 
 *
 *----------------------------------------------------------------*/
public class IntList {
    public int first;
    public IntList rest;


    public IntList(int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    public void addFirst(int x) {
        IntList p = this;
        this.first = x;
        this.rest = p;
    }


    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L.addFirst(10);
        L.addFirst(5);
        int x = L.first;
        System.out.println(x);
    }
}

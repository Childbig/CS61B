package Discussion.Diss6;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/11/2
 *  Last updated:  2018/11/2
 *  Compilation:   javac BadIntegerStack.java
 *  Description: 
 *
 ******************************************************************************/


public class BadIntegerStack {
    public class Node {
        public Integer value;
        public Node prov;

        public Node(Integer value, Node prov) {
            this.value = value;
            this.prov = prov;
        }
    }

    public Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Integer num) {
        top = new Node(num, top);
    }

    public Integer pop() {
        Integer ans = top.value;
        top = top.prov;
        return ans;
    }

    public Integer peek() {
        return top.value;
    }

    public static void main(String[] args) {
        try {
            BadIntegerStack badIntegerStack = new BadIntegerStack();
            badIntegerStack.peek();
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Success");
        } finally {
            System.out.println("经济");
        }

    }
}

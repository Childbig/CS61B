package Exam.ExamPrep1;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/2/12
 *  Last updated:  2019/2/12
 *  Compilation:   javac Foo.java
 *  Description: 
 *
 ******************************************************************************/


public class Foo {
    public int x, y;
    public Foo (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void switchroo(Foo a, Foo b) {
        Foo temp = a;
        a = b;
        b = temp;
    }

    public static void filperoo(Foo a, Foo b) {
        Foo temp = new Foo(a.x, a.y);
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }

    public static void swaperoo(Foo a, Foo b) {
        Foo temp = a;
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }




    public static void main(String[] args) {
        int i = -1;
        System.out.println(i>>> 10);
        System.out.println(2<<1);

    }
}

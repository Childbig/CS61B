package Discussion.Dis1;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/7/13
 *  Last updated:  2018/7/13
 *  Compilation:   javac Foo.java
 *  Description: 
 *
 ******************************************************************************/


public class Foo {
    public int x, y;


    public Foo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void switchero (Foo a, Foo b) {
        Foo temp = a;
        a = b;
        b = temp;
    }

    public static void fliperoo(Foo a, Foo b) {
        Foo temp = new Foo(a.x, b.y);
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
        Foo foobar = new Foo(10, 20);
        Foo baz = new Foo(30, 40);
        switchero(foobar, baz);
        fliperoo(foobar, baz);
        swaperoo(foobar, baz);
    }
}

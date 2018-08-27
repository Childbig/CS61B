package mt1;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/7
 *  Last updated:  2018/8/7
 *  Compilation:   javac mt1.java
 *  Description: 
 *
 ******************************************************************************/


public class mt1 {

    public static int f(int x) {
        if (x == 1) {
            return 1;
        }

        return 2 * f(x / 2);
    }


    public static void main(String[] args) {
        System.out.println(f(7));
        System.out.println(f(8));
        System.out.println(f(6));
        System.out.println(f(4));
    }

}

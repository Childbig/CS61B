package Discussion.Diss6;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/11/2
 *  Last updated:  2018/11/2
 *  Compilation:   javac Mystery.java
 *  Description: 
 *
 ******************************************************************************/


public class Mystery {

    public static void checkIfZero(int x) throws Exception {
        if (x == 0) {
            throw new Exception("x was zero");
        }
    }

    public static int mystery(int x) {
        int counter = 0;
        try {
            while (true) {
                x = x / 2;
                checkIfZero(x);
                counter += 1;
                System.out.println("counter is " + counter); // PRINT STATEMENT
            }
        } catch (Exception e) {
            return  counter;
        }
    }

    public static void main(String[] args) {
        System.out.println("mystery of 1 is " + mystery(1));
        System.out.println("mystery of 6 is " + mystery(6));
    }
}

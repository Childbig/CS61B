package mt1;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/7
 *  Last updated:  2018/8/7
 *  Compilation:   javac ComFunc.java
 *  Description: 
 *
 ******************************************************************************/


public interface ComFunc {
    int apply(int a, int b);
}

class Add implements ComFunc {
    public int apply(int a, int b) {
        return a + b;
    }
}

class Combine {
    public static int combine(ComFunc c, int[] x) {
        if (x.length == 0) {
            return 0;
        }
        if (x.length == 1) {
            return x[0];
        }

        int add = c.apply(x[0], x[1]);
        return helpCombine(c, x, add , 2);
    }

    /**
     * help function to recursion
     * @param x
     * @return
     */
    private static int helpCombine(ComFunc c , int[] x, int adder, int num) {
        if (x.length == 0) {
            return adder;
        }
        adder = c.apply(adder, x[num]);
        return helpCombine(c, x, adder, num + 1);
    }
}

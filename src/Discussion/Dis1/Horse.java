package Discussion.Dis1;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/7/13
 *  Last updated:  2018/7/13
 *  Compilation:   javac Horse.java
 *  Description: 
 *
 ******************************************************************************/


public class Horse {
    Horse same;
    String jimmy;

    public Horse(String lee) {
        jimmy = lee;
    }

    public Horse same(Horse horse) {
        if (same != null) {
            Horse same = horse;
            same.same = horse;
            same = horse.same;
        }

        return same.same;
    }

    public static void test(Horse horse) {
        Horse test = horse;
        horse.jimmy = "123";

        test.jimmy = "test";
    }

    public static void main(String[] args) {
        Horse horse = new Horse("youve beem");
        Horse cult = new Horse("horsed");
        test(cult);
        cult.same = cult;
        cult = cult.same(horse);
        System.out.println(cult.jimmy);
        System.out.println(horse.jimmy);
    }
}

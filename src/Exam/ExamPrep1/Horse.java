package Exam.ExamPrep1;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/2/12
 *  Last updated:  2019/2/12
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

        return  same.same;
    }

    public static void main(String[] args) {
        Horse horse = new Horse("youve been");
        Horse cult = new Horse("horsed");
        cult.same = cult;
        cult = cult.same(horse);
        System.out.println(cult.jimmy);
        System.out.println(horse.jimmy);
    }
}

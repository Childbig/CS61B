package Exam.ExamPrep1;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/2/14
 *  Last updated:  2019/2/14
 *  Compilation:   javac Leaf.java
 *  Description: 
 *
 ******************************************************************************/


public class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}

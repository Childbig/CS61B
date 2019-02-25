package Exam.ExamPrep1;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/2/12
 *  Last updated:  2019/2/12
 *  Compilation:   javac Shock.java
 *  Description: 
 *
 ******************************************************************************/


public class Shock {
    public static int bang;
    public static Shock baby;
    public Shock() {
        this.bang = 100;
    }

    public Shock(int num) {
        this.bang = num;
        baby = starter();
        this.bang += num;
    }
    public static Shock starter() {
        Shock gear = new Shock();
        return gear;
    }
    public static void shrink(Shock statik) {
        statik.bang -= 1;
    }

    public static void main(String[] args) {
        Shock gear = new Shock(200);
        System.out.println(gear.bang);
        shrink(gear);
        shrink(starter());
        System.out.println(gear.bang);
    }
}

package Discussion.ExamPrep3;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/2
 *  Last updated:  2018/8/2
 *  Compilation:   javac Flatten.java
 *  Description: 
 *
 ******************************************************************************/


public class Flatten {


    private static int[] flatten(int[][] x) {
        int totalLength = 0;

        for (int i = 0; i < x.length; i++) {
            totalLength += x[i].length;
        }

        int[]a = new int[totalLength];
        int aIndex = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                a[aIndex] = x[i][j];
                aIndex++;
            }
        }
            return a;
    }
}

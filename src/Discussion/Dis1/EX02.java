package Discussion.Dis1;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/7/2
 *  Last updated:  2018/7/2
 *  Compilation:   javac EX02.java
 *  Description: 
 *
 ******************************************************************************/


public class EX02 {

    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;

    }
}

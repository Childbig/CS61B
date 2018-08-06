package proj1b;

import org.junit.Test;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/6
 *  Last updated:  2018/8/6
 *  Compilation:   javac OffByOne.java
 *  Description: 
 *
 ******************************************************************************/


public class OffByOne implements CharacterComparator {
    @Override
    public boolean equalChars(char x, char y) {


        return Math.abs(x - y) == 1;
    }

}

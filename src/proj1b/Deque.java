package proj1b;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/6
 *  Last updated:  2018/8/6
 *  Compilation:   javac Deque.java
 *  Description: 
 *
 ******************************************************************************/


public interface Deque<T> {
    void addFirst(T item);
    void addLast(T item);
    boolean isEmpty();
    int size();
    void printDeque();
    T removeFirst();
    T removeLast();
    T get(int index);
}

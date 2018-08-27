package hw1;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/24
 *  Last updated:  2018/8/24
 *  Compilation:   javac BoundedQueue.java
 *  Description: 
 *
 ******************************************************************************/


interface BoundedQueue<T> {
    int capacity();
    int fillCount();
    void enqueue(T x);
    T dequeue();
    T peek();

    default boolean isEmpty() {
        return fillCount() == 0;
    }

    default boolean isFull() {
        return fillCount() == capacity();
    }
}

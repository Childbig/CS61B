package synthesizer;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/27
 *  Last updated:  2018/8/27
 *  Compilation:   javac AbstractBoundedQueue.java
 *  Description: 
 *
 ******************************************************************************/


public abstract class AbstractBoundedQueue<T> implements BoudedQueue<T> {
    protected int fillCount;
    protected int capacity;
    public int capacity() {
        return capacity;
    }
    public int fillCount() {
        return fillCount;
    }
    public boolean isEmpty() {
        return capacity() == 0;
    }
    public boolean isFull() {
        return capacity() == fillCount();
    }
    public abstract T peek();
    public abstract T dequeue();
    public abstract void enqueue(T x);
}

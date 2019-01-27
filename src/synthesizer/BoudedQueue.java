package synthesizer;

/******************************************************************************
 *  Author:        sa
 *  Written:       2018/8/27
 *  Last updated:  2018/8/27
 *  Description:
 *
 ******************************************************************************/
public interface BoudedQueue<T> {

    int capacity();
    int fillCount();
    void enqueue(T t);
    T dequeue();
    T peek();

    default boolean isEmpty() {
        return capacity() == 0;
    }
    default boolean isFull() {
        return fillCount() == capacity();
    }
}

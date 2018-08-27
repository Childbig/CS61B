package hw1;

import edu.princeton.cs.algs4.Queue;

import edu.princeton.cs.algs4.Stack;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/24
 *  Last updated:  2018/8/24
 *  Compilation:   javac BoundedQueueImlp.java
 *  Description: 
 *
 ******************************************************************************/


public class BoundedQueueImlp<T> implements  BoundedQueue<T>{

    private int size;
    private Queue<T> queue = new Queue<>();
    private int capacity = 4;

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public int fillCount() {
        return size;
    }

    @Override
    public void enqueue(T x) {
        queue.enqueue(x);
        size++;
    }

    @Override
    public T dequeue() {
        queue.dequeue();
        size--;
        return null;
    }

    @Override
    public T peek() {
        return null;
    }
}

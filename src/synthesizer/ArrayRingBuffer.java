package synthesizer;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/27
 *  Last updated:  2018/8/27
 *  Compilation:   javac ArrayRingBuffer.java
 *  Description: 
 *
 ******************************************************************************/


public class ArrayRingBuffer<T> extends AbstractBoundedQueue<T> {
    /* Index for the next dequeue or peek. */
    private int first;
    /* Index for the next enqueue. */
    private int last;
    /* Array for storing the buffer data. */
    private T[] rb;

    public ArrayRingBuffer(int capacity) {
        // TODO: Create new array with capacity elements.
        //       first, last, and fillCount should all be set to 0.
        //       this.capacity should be set appropriately. Note that the local variable
        //       here shadows the field we inherit from AbstractBoundedQueue, so
        //       you'll need to use this.capacity to set the capacity.
        this.first = 0;
        this.last = 0;
        this.fillCount = 0;
        this.capacity = capacity;
        rb = (T[]) new Object[capacity];
    }

    @Override
    public T peek() {
        return rb[first];
    }

    @Override
    public T dequeue() {
        // TODO: Dequeue the first item. Don't forget to decrease fillCount and update
        if(isEmpty()) {
            throw new RuntimeException("Ring buffer underflow");
        }
        T last = rb[first] = null;
        fillCount--;
        if (first == rb.length -1) {
            first = 0;
        } else {
            first++;
        }
        return last;
    }

    @Override
    public void enqueue(T x) {
            // TODO: Enqueue the item. Don't forget to increase fillCount and update last.
        if (isFull()) {
            throw  new RuntimeException("Ring buffer overflow");
        }

        rb[last] = x;
        fillCount++;
        if (last == capacity() && !isFull()) {
            last = 0;
        } else {
            last++;
        }
        return;
    }


}

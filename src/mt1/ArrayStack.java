package mt1;


import java.util.Stack;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/7
 *  Last updated:  2018/8/7
 *  Compilation:   javac ArrayStack.java
 *  Description: 
 *
 ******************************************************************************/


public class ArrayStack<Item> {
   private Item[] items;
   private int size;
   public ArrayStack() {
       items = (Item[]) new Object[8];
       size = 0;
   }

    /**
     * resizes array to given capacity
     * @param capacity
     */
   private void resize(int capacity) {
        Item[] newItems = (Item[]) new Object[capacity];
        System.arraycopy(items,0, newItems, 0, size);
        items = newItems;
   }

   public void push(Item x) {
       if (usageRatio() == 1) resize(size * 2);
       items[size] = x;
       size += 1;
   }

    public Item pop() {
        if (size == 0) { return null; }
        if (usageRatio() < 0.25 && items.length > 8) {resize(items.length / 2);}
        size = size - 1;
        Item returnItem = items[size];
        items[size] = null;
        return returnItem;
    }

   public int size() {
       return size;
   }

   private double usageRatio() {
       return ((double) size()) / items.length;
   }

}

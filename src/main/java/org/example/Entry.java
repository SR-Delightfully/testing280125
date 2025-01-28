package org.example;

public class Entry<T> {
    private T item;
    private int count;
    public Entry() {
        item = null;
        count = 0;
    }
    public Entry(T i, int c) {
        this.item = i;
        this.count = c;
    }

    public T getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "item='" + item + '\'' +
                ", count=" + count +
                '}';
    }
}

package org.example;

public class GenericNode<T> {
    private T item;
    private GenericNode<T> next;

    public GenericNode() {
        item = null;
        next = null;
    }
    public GenericNode(T newItem, GenericNode<T> nextItem) {
        this.item = newItem;
        this.next = nextItem;
    }

    public void setItem(T newItem) {
        item = newItem;
    }
    public void setNext(GenericNode<T> nextItem) {
        next = nextItem;
    }
    public T getItem() {
        return item;
    }
    public GenericNode<T> getNext() {
        return next;
    }
    public String toString() {
        return "Generic Node: " + item.toString() + next.toString();
    }
}


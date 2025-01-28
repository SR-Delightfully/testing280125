package org.example;

public class GenericLinkedList<T> {
    private GenericNode<T> head;

    public GenericLinkedList() {
        head = null;
    }

    public void addToStart(T item) {
        head = new GenericNode<>(item, head);
    }

    public boolean deleteHeadNode(T target) {
        if (head == null) {
            return false;
        } else {
            head = head.getNext();
            return true;
        }
    }

    public int size() {
        int count = 0;
        GenericNode<T> position = head;

        while ( position != null) {
            count++;
            position = position.getNext();
        }
        return count;
    }

    public GenericNode<T> find(T target) {
        GenericNode<T> position = head;
        T itemAtPosition;

        while ( position != null ) {
           itemAtPosition = position.getItem();
           if (itemAtPosition.equals(target)) {
               return position;
           }
           position = position.getNext();
        }
        return null;
    }

    public boolean contains(T item) {
        return find(item) != null;
    }

    public void outputGenericList() {
        GenericNode<T> position = head;

        while ( position != null ) {
            System.out.println(position.getItem());
            position = position.getNext();
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
    }
}

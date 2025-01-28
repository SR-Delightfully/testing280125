package org.example;

public class Main {
    public static void main(String[] args) {

        GenericLinkedList<Integer> intList = new GenericLinkedList<>();
        int item1 = 43110;
        int item2 = 123;
        int item3 = 7645;
        intList.addToStart(item1);
        intList.addToStart(item2);
        intList.addToStart(item3);

        intList.outputGenericList();
        System.out.println("int list is currently holding " + intList.size() + " elements");System.out.println();

        GenericLinkedList<String> strList = new GenericLinkedList<>();
        String item4 = "Hello";
        String item5 = "World";
        String item6 = "!";
        strList.addToStart(item4);
        strList.addToStart(item5);
        strList.addToStart(item6);

        strList.outputGenericList();
        System.out.println("str list is currently holding " + strList.size() + " elements");System.out.println();


        GenericLinkedList<Entry> entryList = new GenericLinkedList<Entry>();
        Entry entry1 = new Entry('!', 3);
        Entry entry2 = new Entry("WORLD", 1);
        Entry entry3 = new Entry(43110, 2);
        entryList.addToStart(entry1);
        entryList.addToStart(entry2);
        entryList.addToStart(entry3);

        entryList.outputGenericList();
        System.out.println("entry list is currently holding " + strList.size() + " elements");System.out.println();

    }
}

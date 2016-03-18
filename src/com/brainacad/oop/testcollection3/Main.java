package com.brainacad.oop.testcollection3;


import java.util.*;

public class Main {

    public static void main(String[] args) {
// створюємо дві колекції
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
//заповнюємо їх
        for (int i = 0; i < 10; i++) {
            arrayList.add("num_" + i);
            linkedList.add("num_" + i);
        }
//виводимо на друк чере ітератор
        Iterator<String> iterArray = arrayList.iterator();
        while(iterArray.hasNext()) {
            System.out.println(iterArray.next());
        }
        System.out.println();

        Iterator<String> iterSimpleLinked = linkedList.listIterator();
        while(iterSimpleLinked.hasNext()) {
            System.out.println(iterSimpleLinked.next());
        }
        System.out.println();

        //додаємо в одну колекцію іншу по центру
        ListIterator<String> iterLinked = linkedList.listIterator();
        int middleIndexs = arrayList.size() / 2;
        while(iterLinked.hasNext()) {
            arrayList.add(middleIndexs, iterLinked.next());
        }

        //додаємо елементи однієї колекції в іншу з кінця
        int endOfArray = arrayList.size();
        while(iterLinked.hasPrevious()) {
            arrayList.add(endOfArray, iterLinked.previous());
        }
        printElements(arrayList);

    }
//створюємо метод для друку колекції
    public static <E> void printElements(Collection<E> collection) {
        Iterator<E> iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
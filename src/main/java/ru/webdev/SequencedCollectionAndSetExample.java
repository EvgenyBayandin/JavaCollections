package ru.webdev;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionAndSetExample {

    public static void main(String[] args) {

//        SequencedCollection<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.addLast(i); // метод добавления аналогичен методу add()
//        }
//        System.out.println(list); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//
//        System.out.println(list.getFirst()); // 0
//        System.out.println(list.getLast()); // 9
//
//        list.addFirst(-1);
//        System.out.println(list.getFirst()); // -1

        SequencedCollection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.removeFirst();
        list.removeLast();

        System.out.println(list); // [2, 3]

        list.clear();
        System.out.println(list); // [] or NoSuchElementException




    }
}

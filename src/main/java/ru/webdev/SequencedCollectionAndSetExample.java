package ru.webdev;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionAndSetExample {

    public static void main(String[] args) {

        SequencedCollection<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.addLast(i); // метод добавления аналогичен методу add()
        }
        System.out.println(list); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println(list.getFirst()); // 0
        System.out.println(list.getLast()); // 9

        list.addFirst(-1);
        System.out.println(list.getFirst()); // -1


    }
}

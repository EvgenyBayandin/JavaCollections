package ru.webdev;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;
import java.util.TreeMap;
import java.util.TreeSet;

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

//        SequencedCollection<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.removeFirst();
//        list.removeLast();
//
//        System.out.println(list); // [2, 3]
//
//        list.clear();
//        System.out.println(list); // [] or NoSuchElementException

//        SequencedCollection<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 100_000_000; i++) {
//            list.add(i);
//        }
//
//        long start = System.currentTimeMillis();
//        list.removeFirst();
//        long totalTime = System.currentTimeMillis() - start;
//        System.out.printf("Total time: %s ms", totalTime); // Total time: 225 ms

//        SequencedCollection<Integer> list = new LinkedList<>();
//        for (int i = 0; i < 100_000_000; i++) {
//            list.add(i);
//        }
//
//        long start = System.currentTimeMillis();
//        list.removeFirst();
//        long totalTime = System.currentTimeMillis() - start;
//        System.out.printf("Total time: %s ms", totalTime); // Total time: 0 ms

//        SequencedSet<Integer> numbers = new LinkedHashSet<>();
//        numbers.addFirst(1);
//        numbers.addLast(2); // аналогично методу add()
//        numbers.addLast(3);
//        numbers.addFirst(1); // игнорируем, т.к. уже добавлен
//
//        System.out.println(numbers); // [1, 2, 3]
//        System.out.println(numbers.reversed()); // [3, 2, 1]
//
//        numbers.removeFirst();
//        numbers.removeLast();
//        System.out.println(numbers); // [2]


//        SequencedSet<Integer> numbers = new TreeSet<>();
//        numbers.add(2); // addfirst() and addLast() не поддерживаются, т.к. TreeSet сортирует элементы и нельзя определить порядок при добавлении
//        numbers.add(3);
//        numbers.add(1);
//
//        System.out.println(numbers); // [1, 2, 3]
//        System.out.println(numbers.reversed()); // [3, 2, 1]

//        SequencedMap<String, Integer> map = new LinkedHashMap<>();
//        map.putLast("ccc", 789);
//        map.putLast("bbb", 456); // аналогично методу put()
//        map.putFirst("aaa", 123);
//        System.out.println(map); // {aaa=123, ccc=789, bbb=456}
//        System.out.println(map.reversed()); // {bbb=456, ccc=789, aaa=123}

//        SequencedMap<String, Integer> map = new TreeMap<>();
//        map.put("ccc", 789);
//        map.put("aaa", 123);
////        map.putLast("bbb", 456); // UnsupportedOperationException
//        map.put("bbb", 456);
//        System.out.println(map.pollFirstEntry()); //удаляем первый элемент aaa=123
//        System.out.println(map.pollLastEntry()); //удаляем последний элемент ccc=789
//        System.out.println(map); // остался {bbb=456}
//        map.clear(); // очищаем map
//        System.out.println(map); // {}

        SequencedMap<String, Integer> map = new TreeMap<>();
        map.put("ccc", 789);
        map.put("aaa", 123);
        map.put("bbb", 456);
        System.out.println(map.firstEntry()); //получаем первый элемент aaa=123
        System.out.println(map.lastEntry()); //получаем последний элемент ccc=789
        map.clear(); // очищаем map
        System.out.println(map.lastEntry()); // null

    }
}

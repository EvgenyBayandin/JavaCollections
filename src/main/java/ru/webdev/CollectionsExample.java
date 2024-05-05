package ru.webdev;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionsExample {
    public static void main(String[] args) {
//        List<String> fruits = new ArrayList<String>(); // Based on Array, index - value, ordered by insertion
//        fruits.add("apple");
//        fruits.add("kiwi");
//        fruits.add("banana");
//        fruits.add("orange");
//        fruits.add("apple");
//
//        System.out.println(fruits); // [apple, kiwi, banana, orange, apple]

//        List<String> fruits = new LinkedList<>(); // Based on Array, link for item - value, ordered by insertion
//        fruits.add("apple");
//        fruits.add("kiwi");
//        fruits.add("banana");
//        fruits.add("orange");
//        fruits.add("apple");
//
//        System.out.println(fruits); // [apple, kiwi, banana, orange, apple]

//        Set<String> fruits = new HashSet<>(); // Based on Set, unique items, random order
//        fruits.add("apple");
//        fruits.add("kiwi");
//        fruits.add("banana");
//        fruits.add("orange");
//        fruits.add("apple"); // Duplicate items will not be added
//
//        System.out.println(fruits); // [banana, orange, apple, kiwi]

//        Set<String> fruits = new LinkedHashSet<>(); // Based on Set, unique items, ordered by insertion
//        fruits.add("apple");
//        fruits.add("kiwi");
//        fruits.add("banana");
//        fruits.add("orange");
//        fruits.add("apple"); // Duplicate items will not be added
//
//        System.out.println(fruits); // [apple, kiwi, banana, orange]

//        Set<String> fruits = new TreeSet<>(); // Based on Set, unique items, sorted by insertion
//        fruits.add("apple");
//        fruits.add("kiwi");
//        fruits.add("banana");
//        fruits.add("orange");
//        fruits.add("apple"); // Duplicate items will not be added
//
//        System.out.println(fruits); // [apple, banana, kiwi, orange]

//        Map<String, Integer> fruits = new HashMap<>();
//        fruits.put("яблоко", 6); // дубликат перезаписывается новым значением ("яблоко", 4)
//        fruits.put("ананас", 6);
//        fruits.put("банан", 5);
//        fruits.put("яблоко", 4);
//        fruits.putIfAbsent("банан", 5); // здесь не добавится, т.к. такое значение уже есть, иначе добавится новое значение ("банан", 5)!

//        Map<String, Integer> fruits = new LinkedHashMap<>();
//        fruits.putIfAbsent("яблоко", 6);
//        fruits.putIfAbsent("ананас", 6);
//        fruits.putIfAbsent("банан", 5);
//        fruits.putIfAbsent("яблоко", 4);
//
//        System.out.println(fruits); // {яблоко=6, ананас=6, банан=5} Сохраняется порядок добавленияб дубликаты не добавляются!

//        Map<String, Integer> fruits = new TreeMap<>();
//        fruits.putIfAbsent("яблоко", 6);
//        fruits.putIfAbsent("ананас", 6);
//        fruits.putIfAbsent("банан", 5);
//        fruits.putIfAbsent("яблоко", 4);
//
//        System.out.println(fruits); // {ананас=6, банан=5, яблоко=6} Сортируется по возрастанию! Дубликаты не добавляются!

//        Queue<Integer> queue = new LinkedList<>(); // Очередь - FIFO (First In First Out) "первым вошел, первым вышел".
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll()); // 1, 2, 3 - FIFO, порядок вывода сохраняется!
//        }

        Deque<Integer> stack = new LinkedList<>(); // Стек - FILO (First In Last Out) "первым вошел, последним вышел".
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // 3, 2, 1 - FILO, порядок вывода сохраняется наоборот!- FILO, "первым вошел, последним вышел".
        }

        Stack<Integer> stack1 = new Stack<>(); // Стек - FILO (First In Last Out) "первым вошел, последним вышел". Устарел, не рекомендован к использованию! Заменен на Deque.


    }
}
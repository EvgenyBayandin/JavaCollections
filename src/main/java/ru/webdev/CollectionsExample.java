package ru.webdev;

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.LinkedHashSet;
//import java.util.Set;
//import java.util.TreeSet;

import java.util.HashMap;
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

        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("яблоко", 6); // дубликат перезаписывается новым значением ("яблоко", 4)
        fruits.put("ананас", 6);
        fruits.put("банан", 5);
        fruits.put("яблоко", 4);
        fruits.putIfAbsent("банан", 5); // здесь не добавится, т.к. такое значение уже есть, иначе добавится новое значение ("банан", 5)!

        System.out.println(fruits); // {банан=5, яблоко=4, ананас=6}
    }
}
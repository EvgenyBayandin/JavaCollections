package ru.webdev;

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

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

        Set<String> fruits = new LinkedHashSet<>(); // Based on Set, unique items, ordered by insertion
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple"); // Duplicate items will not be added

        System.out.println(fruits); // [apple, kiwi, banana, orange]

    }
}
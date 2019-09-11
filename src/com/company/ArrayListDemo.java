/*
* This exercise explores the functions of arraylist
* such as .add(), .remove(), .size(), .get(), .clear() and .contains()
*
* Familiarize yourself with what goes inside the paranthesis.
* Is it index number? a value at the said index number?
* */

package com.company;
import java.util.ArrayList;
import java.util.Collections;

class ArrayListDemo {
    public static void main(String args[]) {
// Create an array list
        ArrayList<String> aList = new ArrayList<>();

        System.out.println("Initial size of aList: " + aList.size());
// Add elements to the array list
        aList.add("C");
        aList.add("A");
        aList.add("E");
        aList.add("B");
        aList.add("D");
        aList.add("F");
        aList.add(1, "A2");

// Print the size of array list
        System.out.println("\n Size after additions: " + aList.size());

// Display the array list
        System.out.println("\n aList: " + aList);

// Remove elements from the array list
        aList.remove("F");
        System.out.println("\n Size after removal: " + aList.size());
        System.out.println("aList: " + aList);

//        =============================

        String[] values = { "cat", "dog", "bird" };
        ArrayList<String> values2 = new ArrayList<>();
        values2.add("cat");
        values2.add("dog");
        values2.add("bird");

//         Create a one-element ArrayList.
        ArrayList<String> list = new ArrayList<>();
        list.add("elephant");
        System.out.println(list);

//         Add all elements to the ArrayList from an array.
        Collections.addAll(list, values); // Elements to be added may be specified individually or as an array.

//         Display our result.
        System.out.println(list);
    }
}

/*
* This exercise shows the different ways that we can use loops
* (for-loops and while-loops) to iterate through an arraylist */

package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IterateThroughArraylist {
    public static void main(String[] args) {
        //Create a list of names
        ArrayList<String> names = new ArrayList<String>();

        //Add some names in list
        // Choose one of the options and comment out the other code.
            //Option 1 - one at a time
            names.add("Eve");
            names.add("Anna");
            names.add("Tonny");
            names.add("Steve");
            // Option 2 - create and save array and add array to arraylist
            String[] students = new String[]{"Eve", "Anna", "Tonny", "Steve"};
            Collections.addAll(names, students);
            //Option 3 - create array without saving and add array to arraylist
            Collections.addAll(names, new String[]{"Eve", "Anna", "Tonny", "Steve"});

        //Method #1 : Iterate using for loop
        System.out.println("\n Using for loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Method #2 : Iterate using enhanced for loop
        System.out.println("\n Using enhanced for loop");
        for (String name : names) {
            System.out.println(name);
        }

        //Method #3 : Iterate using while loop and iterator
        System.out.println("\nUsing Iterator");
        Iterator it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Method #4 : Iterate using while loop and index
        System.out.println("\n Using while loop and index");
        int i = 0 ;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++ ;
        }
    }
}
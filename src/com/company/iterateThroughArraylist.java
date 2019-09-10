/*
* This exercise shows the different ways that we can use loops (for-loops and while-loops)
* to iterate through an arraylist */

package com.company;
import java.util.ArrayList;
import java.util.Iterator;

public class iterateThroughArraylist {
    public static void main(String[] args) {
        //Create a list of names
        ArrayList<String> names = new ArrayList<String>();

        //Add some names in list
        names.add("Eve");
        names.add("Anna");
        names.add("Tonny");
        names.add("Steve");

        //Method #1 : Iterate using for loop
        System.out.println("Using for loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Method #2 : Iterate using enhanced for loop
        System.out.println("Using enhanced for loop");
        for (String name : names) {
            System.out.println(name);
        }

        //Method #3 : Iterate using while loop and iterator
        System.out.println("Using Iterator");
        Iterator iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Method #4 : Iterate using while loop and index
        System.out.println("Using while loop and index");
        int i = 0 ;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++ ;
        }
    }
}
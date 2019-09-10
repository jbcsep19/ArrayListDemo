/*
* This exercise explores the functions of arraylist
* such as .add(), .remove(), .size(), .get(), .clear() and .contains()
*
* Familiarize yourself with what goes inside the paranthesis.
* Is it index number? a value at the said index number?
* */

package com.company;
import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String args[]) {
// create an array list
        ArrayList<String> al = new ArrayList<>(); // this is al, as in letter 'L', short for array-list

        System.out.println("Initial size of al: " + al.size());
// add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Size of al after additions: " + al.size());
// display the array list
        System.out.println("Contents of al: " + al);
// Remove elements from the array list
        al.remove("F");
//        al.remove("G");
        al.remove("G");
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}

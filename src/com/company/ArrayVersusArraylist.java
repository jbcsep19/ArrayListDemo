/*
* This exercise shows the differences between how to initialize
* and populate an arraylist versus an array
* */

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayVersusArraylist {

    public static void main(String[] args) {
        // Array
        int [] numArray = new int[3];
        numArray[0] = 10;
        numArray[1] = 20;
        numArray[2] = 30;

        // Print
        System.out.println(numArray);

        for (int i = 0; i < numArray.length; i++){
            System.out.println(numArray[i]);
        }

        //============================

        // Array List
        ArrayList<Integer> numArrayList = new ArrayList<>();
        numArrayList.add(10); // index 0
        numArrayList.add(20); // index 1
        numArrayList.add(30); // index 2
        numArrayList.add(50);
        numArrayList.add(40);
        numArrayList.add(2, 25); // 25 would become the new value at index 2

        // Print
        System.out.println(numArrayList);

        for (int i=0; i<numArrayList.size(); i++){
            System.out.println(numArrayList.get(i));
        }
    }
}

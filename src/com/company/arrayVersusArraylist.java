/*
* This exercise shows the differences between how to initialize
* and populate an arraylist versus an array
* */

package com.company;

import java.util.ArrayList;

public class arrayVersusArraylist {

    public static void main(String[] args) {
        // array list
        ArrayList<Integer> numArrayList = new ArrayList<>();
        numArrayList.add(10);
        numArrayList.add(20);
        numArrayList.add(30);
        numArrayList.add(50);
        numArrayList.add(40);
        numArrayList.add(2, 25);

        // print array list
        System.out.println(numArrayList);

        for (int i=0; i<numArrayList.size(); i++){
            System.out.println(numArrayList.get(i));
        }

        //============================

        // array
        int [] numArray = new int[3];
        numArray[0] = 10;
        numArray[1] = 20;
        numArray[2] = 30;

        System.out.println(numArray);

        for (int i = 0; i < numArray.length; i++){
            System.out.println(numArray[i]);
        }





    }

}

package Intermediate_A3_Simon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Rectangular r1 = new Rectangular(12, 5);
        Rectangular r2 = new Rectangular(2, 8);
        Rectangular r3 = new Rectangular(6, 15);
        Rectangular r4 = new Rectangular(15, 25);
        Rectangular r5 = new Rectangular(11, 14);

        Rectangular[] arr = {r1, r2, r3, r4, r5};

       java.util.Arrays.sort(arr, new Comparator<Rectangular>() {
           @Override
           public int compare(Rectangular o1, Rectangular o2) {
               return o1.calcRectArea() - o2.calcRectArea();
           }
       });

        System.out.println("Print array in ascending order");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].calcRectArea());
        }

        // Comparator c = Collections.reverseOrder();

        // Arrays.sort(arr, c);


        System.out.println("Print array in descending order");
        for(int i = arr.length - 1; i >= 0;  i--) {
            System.out.println(arr[i].calcRectArea());
        }






    }
}



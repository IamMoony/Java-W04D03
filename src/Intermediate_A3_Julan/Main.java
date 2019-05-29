package Intermediate_A3_Julan;

import java.util.Comparator;

public class Main {

    public static void main (String[] args) {

        Rectangular[] areaArray = new Rectangular[3];

        areaArray[0] = new Rectangular(5, 10);
        areaArray[1] = new Rectangular(3, 7);
        areaArray[2] = new Rectangular(7, 4);

        java.util.Arrays.sort(areaArray, new Comparator<Rectangular>() {
            @Override
            public int compare(Rectangular e1, Rectangular e2) {
                return e1.area - e2.area;
            }
        });



        for(int i=0; i < areaArray.length; i++) {

            System.out.println("Area: " +areaArray[i].area+ "cm²");

        }
        System.out.println();

        System.out.println("ASCENDING");
        for(int i = 0; i < areaArray.length; i++){
            System.out.println("Area: " + areaArray[i].area + "cm²");
        }
        System.out.println();

        System.out.println("DESCENDING"); //turn around the for statement
        for(int i = areaArray.length - 1; i >= 0; i--){
            System.out.println("Area: " + areaArray[i].area + "cm²");
        }
    }
}

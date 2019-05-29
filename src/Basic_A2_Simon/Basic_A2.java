package Basic_A2_Simon;

import java.util.Arrays;
import java.util.*;

public class Basic_A2 {

    public static int[] copyArrays(int[] arr1, int[] arr2) {


        int[] copyOfArr1 = Arrays.copyOf(arr1, arr1.length);
        int[] copyOfArr2 = Arrays.copyOf(arr2, arr2.length);
        int[] newarray = new int[copyOfArr1.length + copyOfArr2.length];

        System.arraycopy(copyOfArr1, 0, newarray, 0, copyOfArr1.length);
        System.arraycopy(copyOfArr2, 0, newarray,copyOfArr1.length, copyOfArr2.length);


        java.util.Arrays.sort(newarray);
        java.util.Arrays.toString(newarray);

        return newarray;
    }
    public static void main(String[] args) {

        int[] array1 = {1, 3, 4, 6, 5, 7, 8, 12};
        int[] array2 = {2, 4, 5, 6, 7, 8 ,9, 15};

        int[] c = copyArrays(array1, array2);

        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

    }

}



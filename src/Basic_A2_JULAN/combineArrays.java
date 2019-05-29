package Basic_A2_JULAN;

import java.util.Arrays;

public class combineArrays {

    public static void main(String args[]) {

        int[] array1 = {101,102,103,104};
        int[] array2 = {105,106,107,108};
        int[] concatenate = combine(array1, array2);
        System.out.println("concatenated array : " + Arrays.toString(concatenate));

    }


    public static int[] combine(int[] a, int[] b){
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

}

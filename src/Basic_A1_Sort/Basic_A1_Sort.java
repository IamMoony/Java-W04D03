package Basic_A1_Sort;

import java.util.Arrays;

public class Basic_A1_Sort {

        public static int largest(int array[], int n) {
            Arrays.sort(array);
            return array[n - 1];


        }

        public static int seclargest(int array[], int m) {
            Arrays.sort(array);
            return array[m - 2];
        }


    }



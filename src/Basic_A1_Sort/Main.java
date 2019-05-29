package Basic_A1_Sort;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4 ,17 ,5, 18, 55, 76, 6, 15, 16};

        int n = array.length;
        int m = array.length;

        System.out.println(Basic_A1_Sort.largest(array, n));
        System.out.println(Basic_A1_Sort.seclargest(array, m));

    }
}

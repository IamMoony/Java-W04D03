package Intermediate_A4_Simon;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        int temp = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n - i); j++) {
                if(arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

        public static void main(String[] args) {

        int[] arrayOfInts = {1, 2, 3, 4, 5, 8, 11, 12, 15, 16, 17, -10, -5, -8, -9, -12, 18, 22, 25};

            System.out.println("Array before bubble sort");
            System.out.println("------------------------");
            for(int i = 0; i < arrayOfInts.length; i++) {
                System.out.print(arrayOfInts[i] + " ");
            }

            bubbleSort(arrayOfInts);

            System.out.println("Array after bubble sort");
            System.out.println("-----------------------");
            for(int i = 0; i < arrayOfInts.length; i++) {
                System.out.print(arrayOfInts[i] + " ");
            }
        }
    }


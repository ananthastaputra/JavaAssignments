//Question 2: Find Missing Number
//provided with an array of the size n-1. It contains distinct integers in the range of 1 to n.  and returns the missing number in the array

import java.util.Scanner;

class MissingNumberFinder {
    public static void  main(String [] args) {
        Scanner in = new Scanner(System.in);
        int size = in .nextInt();
        int[] arr = new int[size-1];
        for(int i=0;i<size-1;i++)
            arr[i] = in.nextInt();
        System.out.println(missingNumberFinder(arr, size));
    }


    static int missingNumberFinder(int arr[], int size) {
        int number = 0;

        for (int i = 1; i < arr.length; i++) {
            if (i != arr[i-1] && i != size) { // search for the value whether the iteration value exists in the array or not
                number = arr[i - 1] - 1;
                break;
            }
            else {
                number = size;

            };
        };

        return number;
    }
}

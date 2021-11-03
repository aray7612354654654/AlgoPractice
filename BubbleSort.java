/*
* In this file, implement Bubble sort
*
* 1) In ascending order (left to right --> smallest to largest)
* 2) In descending order (right to left --> largest to smallest)
*/

public class BubbleSort {
    /*
    * Bubble sort:
    * The simplest sorting algorithm; works by repeatedly swapping the adjacent elements 
    * if they are in the wrong order.
    *
    * Example Array: {5, 1, 4, 2, 8}
    *
    * First Pass:
    * {[5, 1], 4, 2, 8}
    * {1, [5, 4], 2, 8}
    * {1, 4, [5, 2], 8}
    * {1, 4, 2, [5, 8]}
    * {1, 4, 2, 5, 8}
    *
    * Second Pass:
    * {[1, 4], 2, 5, 8}
    * {1, [4, 2], 5, 8}
    * {1, 2, [4, 5], 8}
    * {1, 2, 4, [5, 8]}
    * {1, 2, 4, 5, 8}
    *
    * Third Pass:
    * {[1, 2], 4, 5, 8} 
    * {1, [2, 4], 5, 8}
    * {1, 2, [4, 5], 8}
    * {1, 2, 4, [5, 8]}
    * {1, 2, 4, 5, 8}
    */

    /**
    * Sorts the inputted array from smallest to largest.
    */
    public static void ascendingBubble(int[] intArr) {
        int n = intArr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }
    }

    /**
    * Sorts the inputted array from largest to smallest.
    */
    public static void descendingBubble(int[] intArr) {
        int n = intArr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intArr[j] < intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }
            
    }

    // Testing:
    public static void main(String[] args) {
        int[] testArr = {1, 10, 4, 3, 5, 8};

        // Printing the test array
        System.out.println("Our Test Array: [");
        for (int i = 0; i < testArr.length; i++) {
            System.out.println(testArr[i]);
        }
        System.out.println("]");

        // Performing an ascending Bubble Sort:
        BubbleSort.ascendingBubble(testArr);
        // Printing ascending Bubble Sort:
        System.out.println("Ascending Bubble Sort: [");
        for (int i = 0; i < testArr.length; i++) {
            System.out.println(testArr[i]);
        }
        System.out.println("]");

        // Performing a descending Bubble Sort:
        BubbleSort.descendingBubble(testArr);
        // Printing descending Bubble Sort
        System.out.println("Descending Bubble Sort: [");
        for (int i = 0; i < testArr.length; i++) {
            System.out.println(testArr[i]);
        }
        System.out.println("]");
    }

}

    /** 
    * In this file, implement Insertion sort
    *
    * 1) In ascending order (left to right)
    * 2) Descending order (right to left)
    */
public class InsertionSort {
    /**
     * A sorting algorithm that works similarly to sorting playing cards.
     * 
     * Array virtually split into sorted and unsorted parts.
     *      The values from the unsorted part are picked and placed in the
     *      correct position in the sorted part.
     * 
     * Algorithm:
     * __________
     *      Iterate from arr[1] to arr[n] over the array.
     *      
     *      Compare the current element (key) to its predecessor.
     *      
     *      If the key element is smaller than its predecessor, compare it to the elements
     *      before. 
     * 
     *      Move the greater elements one position up 
     *      to make space for the swapped element.
     * 
     *      Runs in O(n^2)
     * 
     * Example:
     * ________
     *      arr = {12, 11, 13, 5, 6}
     * 
     *      1) [11, 12], 13, 5, 6
     *      2) [11, 12, 13], 5, 6
     *      3) [5, 11, 12, 13], 6
     *      4) [5, 6, 11, 12, 13]
     */

    
     public static void ascendingInsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0...i-1], that are 
            greater than the key, to one position ahead of their current
            position */

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
     }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }

     public static void descendingInsertionSort(int[] arr) {

     }

     /*private static void moveOver(int [] arr, int startIdx) {
        int currentVal = 0;
        for (int i = startIdx; i < arr.length; i++) {
            while (i + 1 < arr.length - 1) {
                currentVal = arr[i];
                arr[i + 1] = currentVal;
            }
        }
     }*/

    
     public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
 
        // InsertionSort ob = new InsertionSort();
        InsertionSort.ascendingInsertionSort(arr);
 
        printArray(arr);
     }
    }



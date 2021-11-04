/*
* In this file, implement Selection sort
*
* 1) In ascending order (left to right --> smallest to largest)
* 2) In descending order (right to left --> largest to smallest)
*/
public class SelectionSort {

    /**
    * Sorts an array by repeatedly finding the currentimum element (for ascending)
    * from unsorted part and putting it at the beginning. 
    *
    * The algorithm maintains two subarrays in a given array.
    *   1) The subarray which is already sorted.
    *   2) The subarray which is unsorted.
    *
    * In every iteration, the currentimum element (considering ascending) from the unsorted
    * subarray is picked and moved to the sorted subarray.
    *
    * O(n^2)
    */

    /**
     * Example:
     * arr[] = {64, 25, 12, 22, 11}
     *  
     * Find the currentimum element in arr[0...4] and place it at beginning.
     *  --> {[11], 25, 12, 22, 64}
     * 
     * Find current element in arr[1...4] and place it at beginning.
     *  --> {[11, 12], 25, 22, 64}
     * 
     * Find the current element in arr[2...4] and place it at beginning.
     *  --> {[11, 12, 22], 25, 64}
     * 
     * Find the current element in arr[3...4] and place it at beginning.
     *  --> {[11, 12, 22, 25], 64}
     * 
     * arr[] = {[11, 12, 22, 25, 64]} <-- Our fully sorted list
     */

    public static void ascendingSelectionSort(int[] arr) {
        int currentIndex = 0;
        int currentVal = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            currentVal = arr[i];
            currentIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < currentVal) {
                    // swap(arr, i, j);
                    currentVal = arr[j];
                    currentIndex = j;
                }
            } 
        
            if (currentVal < arr[i]) {
                temp = arr[i];
                arr[i] = arr[currentIndex];
                arr[currentIndex] = temp;
            }
        }
    }

    public static void descendingSelectionSort(int[] arr) {
        int currentIndex = 0;
        int currentVal = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            currentVal = arr[i];
            currentIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > currentVal) {
                    // swap(arr, i, j);
                    currentVal = arr[j];
                    currentIndex = j;
                }
            } 
        
            if (currentVal > arr[i]) {
                temp = arr[i];
                arr[i] = arr[currentIndex];
                arr[currentIndex] = temp;
            }
        }
    }

    public static void ascendingSelectionSortTry(int[] arr) {
        int temp = 0;
        int currentVal = 0;
        int currentIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            currentVal = arr[i];
            currentIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    currentVal = arr[j];
                    currentIdx = j;
                }
            }
        
            if (currentVal < arr[i]) {
                temp = arr[i];
                arr[i] = arr[currentIdx];
                arr[currentIdx] = temp;
            }
        }
    }

    /*private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }*/

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");

        System.out.println("\n");

        ascendingSelectionSort(arr);
        System.out.println("Ascending selection sort:");
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");

    
        System.out.println("\n");


        descendingSelectionSort(arr);
        System.out.println("Descending selection sort");
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}

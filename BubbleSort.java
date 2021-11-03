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

    public void ascendingBubble(int[] intArr) {
        for (int i; i < intArr.length(); i++) {
            int currentVal = intArr[i];
            int nextVal = intArr[i + 1];
            if (currentVal > nextVal) {
                intArr[i + 1] = currentVal;
                intArr[i] = nextVal;
            }
        }
    }

}
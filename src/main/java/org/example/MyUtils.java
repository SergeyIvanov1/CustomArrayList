package org.example;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * It is implementation quicksort for sorting ArrayList.
 *
 * @author Ivanov Sergey
 */
@NoArgsConstructor
public class MyUtils<T extends Comparable<? super T>> {

    /**
     * Method adding element to collection by specify index
     *
     * @param list collection of elements
     * @param startIndex Index - start value
     * @param endIndex Index - end value
     */
    public void quicksort(ArrayList<T> list, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivot = division(list, startIndex, endIndex);

            quicksort(list, startIndex, pivot);
            quicksort(list, pivot + 1, endIndex);
        }
    }

    private int division(List<T> list, int leftIndex, int rightIndex) {
        if (leftIndex < 0 || leftIndex > rightIndex || rightIndex > list.size()){
            throw new IllegalArgumentException();
        }
        int pivot = (leftIndex + rightIndex) / 2;
        T pivotValue = list.get(pivot);

        leftIndex--;
        rightIndex++;

        while (true) {
            do {
                leftIndex++;

            } while (list.get(leftIndex).compareTo(pivotValue) < 0);

            do {
                rightIndex--;
            } while (list.get(rightIndex).compareTo(pivotValue) > 0);

            if (leftIndex >= rightIndex) {
                return rightIndex;
            }
            replace(list, leftIndex, rightIndex);
        }
    }

    private void replace(List<T> list, int leftIndex, int rightIndex) {
        T temp = list.get(leftIndex);
        list.set(leftIndex, list.get(rightIndex));
        list.set(rightIndex, temp);
    }
}

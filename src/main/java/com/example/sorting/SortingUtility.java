package com.example.sorting;

public class SortingUtility {

    /**
     * Gnome Sort using Comparable elements.
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] a) {
        int pos = 0;

        while (pos < a.length) {
            // Move forward if in order, otherwise swap and move back
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                pos = pos + 1;
            } else {
                swap(a, pos, pos - 1);
                pos = pos - 1;
            }
        }
    }

    /**
     * Cocktail Shaker Sort (bidirectional bubble sort).
     */
    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {
        boolean swapped;

        do {
            swapped = false;

            // Forward pass
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

            // If no swaps, array is sorted
            if (!swapped) {
                break;
            }

            swapped = false;

            // Backward pass
            for (int i = a.length - 2; i >= 0; i--) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

        } while (swapped);
    }

    /**
     * Shell Sort using Ciura's gap sequence.
     */
    public static <T extends Comparable<T>> void shellSort(T[] a) {
        int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};
        int n = a.length;

        // Process each gap
        for (int gap : gaps) {
            for (int i = gap; i < n; i++) {
                T temp = a[i];
                int j;

                // Use a for loop to shift elements by gap
                for (j = i; j >= gap && a[j - gap].compareTo(temp) > 0; j -= gap) {
                    a[j] = a[j - gap];
                }

                // Place temp in its correct position
                a[j] = temp;
            }
        }
    }

    /**
     * Provided swap method.
     */
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}







***Prompt 1:***
I need the provided sorting algorithm pseudocode to be generated in the Java programming language. All variable names must be preserved exactly 
as they have been provided. The code needs to have a generic comparable implementation. Provide comments as needed for clarity. Utilize the provided 
Swap method where appropriate. Below are three sorting algorithms written in pseudocode along with their respective method headers:


public static <T extends Comparable<T>> void gnomeSort(T[] a)

procedure gnomeSort(a[]):
pos := 0
while pos < length(a):
if (pos == 0 or a[pos] >= a[pos-1]):
pos := pos + 1
else:
swap a[pos] and a[pos-1]
pos := pos - 1





public static <T extends Comparable<T>> void cocktailShakerSort(T[] a)

procedure cocktailShakerSort(a : list of sortable items) is
do
swapped := false
for each i in 0 to length(a) − 1 do:
if a[i] > a[i + 1] then
swap(a[i], a[i + 1])
swapped := true
end if
end for
if not swapped then
break do-while loop
end if
swapped := false
for each i in length(a) − 1 to 0 do:
if a[i] > a[i + 1] then
swap(a[i], a[i + 1])
swapped := true
end if
end for
while swapped
end procedure




public static <T extends Comparable<T>> void shellSort(T[] a)

# Sort an array a[0...n-1].
gaps = [701, 301, 132, 57, 23, 10, 4, 1]  # Ciura gap sequence
n = a[] length

# Start with the largest gap and work down to a gap of 1
foreach (gap in gaps)
{
# Do a gapped insertion sort for every elements in gaps
for (i = gap; i < n; i += 1)
{
# save a[i] in temp and make a hole at position i
temp = a[i]
# shift earlier gap-sorted elements up until the correct location for a[i] is found
for (j = i; (j >= gap) && (a[j - gap] > temp); j -= gap)
{
a[j] = a[j - gap]
}
# put temp (the original a[i]) in its correct location
a[j] = temp
}
}



private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }

Generated Code:
public class SortingAlgorithms {

    /**
     * Gnome Sort using generic Comparable elements.
     *
     * procedure gnomeSort(a[]):
     *     pos := 0
     *     while pos < length(a):
     *         if (pos == 0 or a[pos] >= a[pos-1]):
     *             pos := pos + 1
     *         else:
     *             swap a[pos] and a[pos-1]
     *             pos := pos - 1
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] a) {
        int pos = 0;

        // Walk through the array, moving backwards whenever we find
        // two elements out of order, like a "gnome" stepping back.
        while (pos < a.length) {
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                pos = pos + 1;
            } else {
                // swap a[pos] and a[pos - 1]
                swap(a, pos, pos - 1);
                pos = pos - 1;
            }
        }
    }

    /**
     * Cocktail Shaker Sort (bidirectional bubble sort) using generic Comparable elements.
     *
     * procedure cocktailShakerSort(a : list of sortable items) is
     *     do
     *         swapped := false
     *         for each i in 0 to length(a) − 1 do:
     *             if a[i] > a[i + 1] then
     *                 swap(a[i], a[i + 1])
     *                 swapped := true
     *             end if
     *         end for
     *         if not swapped then
     *             break do-while loop
     *         end if
     *         swapped := false
     *         for each i in length(a) − 1 to 0 do:
     *             if a[i] > a[i + 1] then
     *                 swap(a[i], a[i + 1])
     *                 swapped := true
     *             end if
     *         end for
     *     while swapped
     * end procedure
     */
    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {
        boolean swapped;

        // Repeatedly bubble the largest element to the end (forward pass)
        // and the smallest element to the beginning (backward pass)
        // until no swaps occur.
        do {
            swapped = false;

            // Forward pass: 0 to length(a) - 2 (so a[i + 1] is in bounds)
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

            // If nothing was swapped, the array is sorted.
            if (!swapped) {
                break;
            }

            swapped = false;

            // Backward pass: from length(a) - 2 down to 0
            // (again, so a[i + 1] is in bounds)
            for (int i = a.length - 2; i >= 0; i--) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

        } while (swapped);
    }

    /**
     * Shell Sort using Ciura's gap sequence and generic Comparable elements.
     *
     * # Sort an array a[0...n-1].
     * gaps = [701, 301, 132, 57, 23, 10, 4, 1]  # Ciura gap sequence
     * n = a[] length
     *
     * # Start with the largest gap and work down to a gap of 1
     * foreach (gap in gaps)
     * {
     *     # Do a gapped insertion sort for every elements in gaps
     *     for (i = gap; i < n; i += 1)
     *     {
     *         # save a[i] in temp and make a hole at position i
     *         temp = a[i]
     *         # shift earlier gap-sorted elements up until the correct location for a[i] is found
     *         for (j = i; (j >= gap) && (a[j - gap] > temp); j -= gap)
     *         {
     *             a[j] = a[j - gap]
     *         }
     *         # put temp (the original a[i]) in its correct location
     *         a[j] = temp
     *     }
     * }
     */
    public static <T extends Comparable<T>> void shellSort(T[] a) {
        // Ciura gap sequence
        int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};
        int n = a.length;

        // Start with the largest gap and work down to a gap of 1
        for (int gap : gaps) {
            // Do a gapped insertion sort for this gap size.
            for (int i = gap; i < n; i += 1) {
                // save a[i] in temp and make a hole at position i
                T temp = a[i];
                int j;

                // shift earlier gap-sorted elements up until the correct location for temp is found
                for (j = i; (j >= gap) && (a[j - gap].compareTo(temp) > 0); j -= gap) {
                    a[j] = a[j - gap];
                }

                // put temp (the original a[i]) in its correct location
                a[j] = temp;
            }
        }
    }

    /**
     * Provided swap method. Used where the pseudocode indicates a swap.
     */
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}







***Prompt 2 & 3:***
Can you simplify the comments? Including the pseudocode looks messy
Change the class name to public class SortingUtility


Code Generated:
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
                int j = i;

                // Shift elements until correct position is found
                while (j >= gap && a[j - gap].compareTo(temp) > 0) {
                    a[j] = a[j - gap];
                    j -= gap;
                }

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







***Prompt 4:***
can you change the shellSort method to use a for loop to shift elements instead of a while loop?



Code Generated:
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



***Verification Notes***
To confirm variable names were preserved I cross-referenced the pseudocode with the generated code from ChatGPT. The only error I found was in the Shellsort method where a while loop
had been used instead of a for loop. The while loop still would've worked since the logic was the same, just formatted differently.

***Modifications***
The comments were long because the pseudocode was included in them. Removing the pseudocode and keeping the comments simple. No other modifications have been made to the generated code.

***AI Swap Method***
ChatGPT correctly used the provided swap method to swap items. The swap method was only used for the first two algorithms since Shellsort performs a gapped insertion sort instead
of a swap between two adjacent items.










***Test Prompts***




***gnomeSort Test***
Generate JUnit 5 unit tests for this sorting method:

public static <T extends Comparable<T>> void gnomeSort(T[] a)

Algorithm details:
- traverses the list and compares items
- moves forward if in order
- swap and move back if order is not fulfilled

Requirements:
1. Use JUnit 5 with @Test annotations
2. Use only standard assertions (assertEquals, assertArrayEquals, assertTrue, etc.)
3. Do not use parameterized tests or advanced features
4. Test method names should follow: testMethodName_scenario_expectedBehavior

Test categories needed:
1. Empty array
2. Single element
3. Two elements (sorted and unsorted)
4. Already sorted array (forward and reverse)
5. Array with all duplicates
6. Array with some duplicates
7. Random unsorted array
8. Test with both Integer[] and String[] to verify generic behavior

For each test:
- Use descriptive @DisplayName annotation
- Include comments explaining what's being validated
- Use assertArrayEquals for comparing array contents
- Show the input array, call the method, verify the result

After generating tests, list any edge cases I should consider adding manually.






Generated Code:

package com.example.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingUtilityGnomeSortTest {

    // 1. Empty array
    @Test
    @DisplayName("gnomeSort: empty Integer array should remain empty")
    public void testGnomeSort_emptyArray_returnsEmptyArray() {
        // Arrange: empty array
        Integer[] input = {};
        Integer[] expected = {};

        // Act: sort the array
        SortingUtility.gnomeSort(input);

        // Assert: array remains empty
        assertArrayEquals(expected, input, "Empty array should remain unchanged after sorting.");
    }

    // 2. Single element
    @Test
    @DisplayName("gnomeSort: single-element Integer array should remain unchanged")
    public void testGnomeSort_singleElementArray_remainsUnchanged() {
        // Arrange: single-element array
        Integer[] input = {42};
        Integer[] expected = {42};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "Single-element array should remain unchanged after sorting.");
    }

    // 3. Two elements (already sorted)
    @Test
    @DisplayName("gnomeSort: two-element Integer array already sorted should remain unchanged")
    public void testGnomeSort_twoElementArrayAlreadySorted_remainsUnchanged() {
        // Arrange
        Integer[] input = {1, 2};
        Integer[] expected = {1, 2};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "Already sorted two-element array should remain unchanged.");
    }

    // 3. Two elements (unsorted)
    @Test
    @DisplayName("gnomeSort: two-element Integer array unsorted should become sorted ascending")
    public void testGnomeSort_twoElementArrayUnsorted_getsSortedAscending() {
        // Arrange
        Integer[] input = {2, 1};
        Integer[] expected = {1, 2};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "Unsorted two-element array should be sorted into ascending order.");
    }

    // 4. Already sorted array (ascending)
    @Test
    @DisplayName("gnomeSort: already sorted ascending Integer array should remain unchanged")
    public void testGnomeSort_alreadySortedAscendingArray_remainsUnchanged() {
        // Arrange
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "Already sorted ascending array should remain unchanged.");
    }

    // 4. "Already sorted" in reverse (i.e., descending, needs full sorting)
    @Test
    @DisplayName("gnomeSort: reverse-sorted Integer array should be sorted ascending")
    public void testGnomeSort_reverseSortedArray_getsSortedAscending() {
        // Arrange: reverse order
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "Reverse-sorted array should be sorted into ascending order.");
    }

    // 5. Array with all duplicates
    @Test
    @DisplayName("gnomeSort: Integer array with all duplicate elements should remain unchanged")
    public void testGnomeSort_allDuplicateElements_remainsUnchanged() {
        // Arrange
        Integer[] input = {7, 7, 7, 7, 7};
        Integer[] expected = {7, 7, 7, 7, 7};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "Array with all duplicate elements should remain logically the same.");
    }

    // 6. Array with some duplicates
    @Test
    @DisplayName("gnomeSort: Integer array with some duplicates should be sorted ascending")
    public void testGnomeSort_arrayWithSomeDuplicates_getsSortedAscending() {
        // Arrange
        Integer[] input = {3, 1, 2, 3, 2, 1};
        Integer[] expected = {1, 1, 2, 2, 3, 3};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "Array with duplicate values should be sorted in ascending order.");
    }

    // 7. Random unsorted array (Integers)
    @Test
    @DisplayName("gnomeSort: random unsorted Integer array should be sorted ascending")
    public void testGnomeSort_randomUnsortedIntegerArray_getsSortedAscending() {
        // Arrange: mixed positive, negative, and zero
        Integer[] input = {10, -3, 5, 0, 8, -1, 4};
        Integer[] expected = {-3, -1, 0, 4, 5, 8, 10};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "Random unsorted Integer array should be sorted into ascending order.");
    }

    // 8. Generic behavior: String[] tests

    @Test
    @DisplayName("gnomeSort: single-element String array should remain unchanged")
    public void testGnomeSort_singleElementStringArray_remainsUnchanged() {
        // Arrange
        String[] input = {"apple"};
        String[] expected = {"apple"};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "Single-element String array should remain unchanged after sorting.");
    }

    @Test
    @DisplayName("gnomeSort: unsorted String array should be sorted lexicographically")
    public void testGnomeSort_unsortedStringArray_getsSortedLexicographically() {
        // Arrange
        String[] input = {"pear", "apple", "orange", "banana"};
        String[] expected = {"apple", "banana", "orange", "pear"};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "Unsorted String array should be sorted in lexicographical order.");
    }

    @Test
    @DisplayName("gnomeSort: String array with duplicates should be sorted lexicographically")
    public void testGnomeSort_stringArrayWithDuplicates_getsSortedLexicographically() {
        // Arrange
        String[] input = {"delta", "alpha", "charlie", "alpha", "bravo"};
        String[] expected = {"alpha", "alpha", "bravo", "charlie", "delta"};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "String array with duplicates should be sorted lexicographically.");
    }
}




***cocktailShakerSort Test***

Generate JUnit 5 unit tests for this sorting method:

public static <T extends Comparable<T>> void cocktailShakerSort(T[] A)

Algorithm details:
- Sorts array in-place using bidirectional bubble sort
- Alternates between forward and backward passes
- Uses a 'swapped' flag to detect when sorting is complete

Requirements:
1. Use JUnit 5 with @Test annotations
2. Use only standard assertions (assertEquals, assertArrayEquals, assertTrue, etc.)
3. Do not use parameterized tests or advanced features
4. Test method names should follow: testMethodName_scenario_expectedBehavior

Test categories needed:
1. Empty array
2. Single element
3. Two elements (sorted and unsorted)
4. Already sorted array (forward and reverse)
5. Array with all duplicates
6. Array with some duplicates
7. Random unsorted array
8. Test with both Integer[] and String[] to verify generic behavior

For each test:
- Use descriptive @DisplayName annotation
- Include comments explaining what's being validated
- Use assertArrayEquals for comparing array contents
- Show the input array, call the method, verify the result

After generating tests, list any edge cases I should consider adding manually.



Code Generated:

package com.example.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingUtilityCocktailShakerSortTest {

    // 1. Empty array
    @Test
    @DisplayName("cocktailShakerSort: empty Integer array should remain empty")
    public void testCocktailShakerSort_emptyArray_returnsEmptyArray() {
        // Arrange: empty array
        Integer[] input = {};
        Integer[] expected = {};

        // Act: sort the array in-place
        SortingUtility.cocktailShakerSort(input);

        // Assert: array remains empty
        assertArrayEquals(expected, input, "Empty array should remain unchanged after sorting.");
    }

    // 2. Single element
    @Test
    @DisplayName("cocktailShakerSort: single-element Integer array should remain unchanged")
    public void testCocktailShakerSort_singleElementArray_remainsUnchanged() {
        // Arrange: single-element array
        Integer[] input = {42};
        Integer[] expected = {42};

        // Act
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "Single-element array should remain unchanged after sorting.");
    }

    // 3. Two elements (already sorted)
    @Test
    @DisplayName("cocktailShakerSort: two-element Integer array already sorted should remain unchanged")
    public void testCocktailShakerSort_twoElementArrayAlreadySorted_remainsUnchanged() {
        // Arrange
        Integer[] input = {1, 2};
        Integer[] expected = {1, 2};

        // Act
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "Already sorted two-element array should remain unchanged.");
    }

    // 3. Two elements (unsorted)
    @Test
    @DisplayName("cocktailShakerSort: two-element Integer array unsorted should become sorted ascending")
    public void testCocktailShakerSort_twoElementArrayUnsorted_getsSortedAscending() {
        // Arrange
        Integer[] input = {2, 1};
        Integer[] expected = {1, 2};

        // Act
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "Unsorted two-element array should be sorted into ascending order.");
    }

    // 4. Already sorted array (ascending)
    @Test
    @DisplayName("cocktailShakerSort: already sorted ascending Integer array should remain unchanged")
    public void testCocktailShakerSort_alreadySortedAscendingArray_remainsUnchanged() {
        // Arrange: array is already in ascending order
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};

        // Act
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "Already sorted ascending array should remain unchanged after sorting.");
    }

    // 4. Reverse-sorted array (descending)
    @Test
    @DisplayName("cocktailShakerSort: reverse-sorted Integer array should be sorted ascending")
    public void testCocktailShakerSort_reverseSortedArray_getsSortedAscending() {
        // Arrange: reverse order, worst-case for a bubble-style algorithm
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};

        // Act: forward and backward passes should fully sort the array
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "Reverse-sorted array should be sorted into ascending order.");
    }

    // 5. Array with all duplicates
    @Test
    @DisplayName("cocktailShakerSort: Integer array with all duplicate elements should remain unchanged logically")
    public void testCocktailShakerSort_allDuplicateElements_remainsLogicallyUnchanged() {
        // Arrange
        Integer[] input = {7, 7, 7, 7, 7};
        Integer[] expected = {7, 7, 7, 7, 7};

        // Act
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "Array with all equal elements should remain the same logically after sorting.");
    }

    // 6. Array with some duplicates
    @Test
    @DisplayName("cocktailShakerSort: Integer array with some duplicates should be sorted ascending")
    public void testCocktailShakerSort_arrayWithSomeDuplicates_getsSortedAscending() {
        // Arrange: unsorted with duplicates
        Integer[] input = {3, 1, 2, 3, 2, 1};
        Integer[] expected = {1, 1, 2, 2, 3, 3};

        // Act
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "Array with duplicate values should be sorted in ascending order.");
    }

    // 7. Random unsorted array (Integers)
    @Test
    @DisplayName("cocktailShakerSort: random unsorted Integer array should be sorted ascending")
    public void testCocktailShakerSort_randomUnsortedIntegerArray_getsSortedAscending() {
        // Arrange: mix of positive, negative, and zero
        Integer[] input = {10, -3, 5, 0, 8, -1, 4};
        Integer[] expected = {-3, -1, 0, 4, 5, 8, 10};

        // Act: bidirectional passes should bring small elements to front and large to back
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "Random unsorted Integer array should be sorted into ascending order.");
    }

    // 8. Generic behavior: String[] tests

    @Test
    @DisplayName("cocktailShakerSort: single-element String array should remain unchanged")
    public void testCocktailShakerSort_singleElementStringArray_remainsUnchanged() {
        // Arrange
        String[] input = {"apple"};
        String[] expected = {"apple"};

        // Act
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "Single-element String array should remain unchanged after sorting.");
    }

    @Test
    @DisplayName("cocktailShakerSort: unsorted String array should be sorted lexicographically")
    public void testCocktailShakerSort_unsortedStringArray_getsSortedLexicographically() {
        // Arrange: out of order lexicographically
        String[] input = {"pear", "apple", "orange", "banana"};
        String[] expected = {"apple", "banana", "orange", "pear"};

        // Act
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "Unsorted String array should be sorted in lexicographical order.");
    }

    @Test
    @DisplayName("cocktailShakerSort: String array with duplicates should be sorted lexicographically")
    public void testCocktailShakerSort_stringArrayWithDuplicates_getsSortedLexicographically() {
        // Arrange
        String[] input = {"delta", "alpha", "charlie", "alpha", "bravo"};
        String[] expected = {"alpha", "alpha", "bravo", "charlie", "delta"};

        // Act
        SortingUtility.cocktailShakerSort(input);

        // Assert
        assertArrayEquals(expected, input, "String array with duplicates should be sorted lexicographically.");
    }
}







***shellSort Test***



Generate JUnit 5 unit tests for this sorting method:

public static <T extends Comparable<T>> void shellSort(T[] a)

Algorithm details:
- Sorts array using gapped insertion sort
- utilizes Ciura's gap sequence
- A final gap of 1 completes the sort

Requirements:
1. Use JUnit 5 with @Test annotations
2. Use only standard assertions (assertEquals, assertArrayEquals, assertTrue, etc.)
3. Do not use parameterized tests or advanced features
4. Test method names should follow: testMethodName_scenario_expectedBehavior

Test categories needed:
1. Empty array
2. Single element
3. Two elements (sorted and unsorted)
4. Already sorted array (forward and reverse)
5. Array with all duplicates
6. Array with some duplicates
7. Random unsorted array
8. Test with both Integer[] and String[] to verify generic behavior

For each test:
- Use descriptive @DisplayName annotation
- Include comments explaining what's being validated
- Use assertArrayEquals for comparing array contents
- Show the input array, call the method, verify the result




Code Generated:

package com.example.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingUtilityShellSortTest {

    // 1. Empty array
    @Test
    @DisplayName("shellSort: empty Integer array should remain empty")
    public void testShellSort_emptyArray_returnsEmptyArray() {
        // Arrange: empty array
        Integer[] input = {};
        Integer[] expected = {};

        // Act: sort the array using shellSort
        SortingUtility.shellSort(input);

        // Assert: array remains empty
        assertArrayEquals(expected, input, "Empty array should remain unchanged after shellSort.");
    }

    // 2. Single element
    @Test
    @DisplayName("shellSort: single-element Integer array should remain unchanged")
    public void testShellSort_singleElementArray_remainsUnchanged() {
        // Arrange: single-element array
        Integer[] input = {42};
        Integer[] expected = {42};

        // Act: shellSort should not modify a single-element array
        SortingUtility.shellSort(input);

        // Assert: array remains unchanged
        assertArrayEquals(expected, input, "Single-element array should remain unchanged after shellSort.");
    }

    // 3. Two elements (sorted)
    @Test
    @DisplayName("shellSort: two-element Integer array already sorted should remain unchanged")
    public void testShellSort_twoElementArrayAlreadySorted_remainsUnchanged() {
        // Arrange: already sorted two-element array
        Integer[] input = {1, 2};
        Integer[] expected = {1, 2};

        // Act: shellSort should detect it's already in order
        SortingUtility.shellSort(input);

        // Assert: order should not change
        assertArrayEquals(expected, input, "Already sorted two-element array should remain unchanged after shellSort.");
    }

    // 3. Two elements (unsorted)
    @Test
    @DisplayName("shellSort: two-element Integer array unsorted should become sorted ascending")
    public void testShellSort_twoElementArrayUnsorted_getsSortedAscending() {
        // Arrange: unsorted two-element array
        Integer[] input = {2, 1};
        Integer[] expected = {1, 2};

        // Act: shellSort should swap them into correct order
        SortingUtility.shellSort(input);

        // Assert: array should now be ascending
        assertArrayEquals(expected, input, "Unsorted two-element array should be sorted into ascending order by shellSort.");
    }

    // 4. Already sorted array (ascending)
    @Test
    @DisplayName("shellSort: already sorted ascending Integer array should remain unchanged")
    public void testShellSort_alreadySortedAscendingArray_remainsUnchanged() {
        // Arrange: array already sorted in ascending order
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};

        // Act: shellSort should do minimal work
        SortingUtility.shellSort(input);

        // Assert: array remains in the same order
        assertArrayEquals(expected, input, "Already sorted ascending array should remain unchanged after shellSort.");
    }

    // 4. Reverse-sorted array (descending)
    @Test
    @DisplayName("shellSort: reverse-sorted Integer array should be sorted ascending")
    public void testShellSort_reverseSortedArray_getsSortedAscending() {
        // Arrange: reverse order (worst-case for many sorts)
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};

        // Act: shellSort should reorder into ascending order
        SortingUtility.shellSort(input);

        // Assert: array should now be ascending
        assertArrayEquals(expected, input, "Reverse-sorted array should be sorted into ascending order by shellSort.");
    }

    // 5. Array with all duplicates
    @Test
    @DisplayName("shellSort: Integer array with all duplicate elements should remain logically unchanged")
    public void testShellSort_allDuplicateElements_remainsLogicallyUnchanged() {
        // Arrange: all elements are the same
        Integer[] input = {5, 5, 5, 5, 5};
        Integer[] expected = {5, 5, 5, 5, 5};

        // Act: shellSort should not disturb equal elements
        SortingUtility.shellSort(input);

        // Assert: contents and order should appear unchanged
        assertArrayEquals(expected, input, "Array with all same elements should remain logically unchanged after shellSort.");
    }

    // 6. Array with some duplicates
    @Test
    @DisplayName("shellSort: Integer array with some duplicates should be sorted ascending")
    public void testShellSort_arrayWithSomeDuplicates_getsSortedAscending() {
        // Arrange: unsorted array containing repeated values
        Integer[] input = {3, 1, 2, 3, 2, 1};
        Integer[] expected = {1, 1, 2, 2, 3, 3};

        // Act: shellSort should correctly position all duplicates
        SortingUtility.shellSort(input);

        // Assert: duplicates should be grouped in ascending order
        assertArrayEquals(expected, input, "Array with duplicates should be sorted in ascending order by shellSort.");
    }

    // 7. Random unsorted array (Integers)
    @Test
    @DisplayName("shellSort: random unsorted Integer array should be sorted ascending")
    public void testShellSort_randomUnsortedIntegerArray_getsSortedAscending() {
        // Arrange: mix of positive, negative, and zero values
        Integer[] input = {10, -3, 5, 0, 8, -1, 4};
        Integer[] expected = {-3, -1, 0, 4, 5, 8, 10};

        // Act: shellSort using Ciura's gaps should sort the array
        SortingUtility.shellSort(input);

        // Assert: result should be in ascending numeric order
        assertArrayEquals(expected, input, "Random unsorted Integer array should be sorted into ascending order by shellSort.");
    }

    // 8. Generic behavior: String[] tests

    @Test
    @DisplayName("shellSort: single-element String array should remain unchanged")
    public void testShellSort_singleElementStringArray_remainsUnchanged() {
        // Arrange: single String element
        String[] input = {"apple"};
        String[] expected = {"apple"};

        // Act: shellSort should leave a single-element String array unchanged
        SortingUtility.shellSort(input);

        // Assert
        assertArrayEquals(expected, input, "Single-element String array should remain unchanged after shellSort.");
    }

    @Test
    @DisplayName("shellSort: unsorted String array should be sorted lexicographically")
    public void testShellSort_unsortedStringArray_getsSortedLexicographically() {
        // Arrange: Strings in non-lexicographical order
        String[] input = {"pear", "apple", "orange", "banana"};
        String[] expected = {"apple", "banana", "orange", "pear"};

        // Act: shellSort should sort Strings by their natural compareTo order
        SortingUtility.shellSort(input);

        // Assert: array is sorted lexicographically
        assertArrayEquals(expected, input, "Unsorted String array should be sorted in lexicographical order by shellSort.");
    }

    @Test
    @DisplayName("shellSort: String array with duplicates should be sorted lexicographically")
    public void testShellSort_stringArrayWithDuplicates_getsSortedLexicographically() {
        // Arrange: String array with repeated values
        String[] input = {"delta", "alpha", "charlie", "alpha", "bravo"};
        String[] expected = {"alpha", "alpha", "bravo", "charlie", "delta"};

        // Act: shellSort should correctly handle duplicate Strings
        SortingUtility.shellSort(input);

        // Assert: array is sorted and duplicates are grouped
        assertArrayEquals(expected, input, "String array with duplicates should be sorted lexicographically by shellSort.");
    }
}

*** Tests remain unchanged since they appear to accomplish their purpose
*** I did change the test names to remove the underscores to follow the camelCase convention format



package com.example.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingUtilityTest {

    //GNOME SORT TESTS
    // 1. Empty array
    @Test
    @DisplayName("gnomeSort: empty Integer array should remain empty")
    public void testGnomeSortEmptyArrayReturnsEmptyArray() {
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
    public void testGnomeSortSingleElementArrayRemainsUnchanged() {
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
    public void testGnomeSortTwoElementArrayAlreadySortedRemainsUnchanged() {
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
    public void testGnomeSortTwoElementArrayUnsortedGetsSortedAscending() {
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
    public void testGnomeSortAlreadySortedAscendingArrayRemainsUnchanged() {
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
    public void testGnomeSortReverseSortedArrayGetsSortedAscending() {
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
    public void testGnomeSortAllDuplicateElementsRemainsUnchanged() {
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
    public void testGnomeSortArrayWithSomeDuplicatesGetsSortedAscending() {
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
    public void testGnomeSortRandomUnsortedIntegerArrayGetsSortedAscending() {
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
    public void testGnomeSortSingleElementStringArrayRemainsUnchanged() {
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
    public void testGnomeSortUnsortedStringArrayGetsSortedLexicographically() {
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
    public void testGnomeSortStringArrayWithDuplicatesGetsSortedLexicographically() {
        // Arrange
        String[] input = {"delta", "alpha", "charlie", "alpha", "bravo"};
        String[] expected = {"alpha", "alpha", "bravo", "charlie", "delta"};

        // Act
        SortingUtility.gnomeSort(input);

        // Assert
        assertArrayEquals(expected, input, "String array with duplicates should be sorted lexicographically.");
    }






        //COCKTAIL SHAKER SORT TESTS
        // 1. Empty array
        @Test
        @DisplayName("cocktailShakerSort: empty Integer array should remain empty")
        public void testCocktailShakerSortEmptyArrayReturnsEmptyArray() {
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
        public void testCocktailShakerSortSingleElementArrayRemainsUnchanged() {
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
        public void testCocktailShakerSortTwoElementArrayAlreadySortedRemainsUnchanged() {
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
        public void testCocktailShakerSortTwoElementArrayUnsortedGetsSortedAscending() {
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
        public void testCocktailShakerSortAlreadySortedAscendingArrayRemainsUnchanged() {
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
        public void testCocktailShakerSortReverseSortedArrayGetsSortedAscending() {
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
        public void testCocktailShakerSortAllDuplicateElementsRemainsLogicallyUnchanged() {
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
        public void testCocktailShakerSortArrayWithSomeDuplicatesGetsSortedAscending() {
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
        public void testCocktailShakerSortRandomUnsortedIntegerArrayGetsSortedAscending() {
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
        public void testCocktailShakerSortSingleElementStringArrayRemainsUnchanged() {
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
        public void testCocktailShakerSortUnsortedStringArrayGetsSortedLexicographically() {
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
        public void testCocktailShakerSortStringArrayWithDuplicatesGetsSortedLexicographically() {
            // Arrange
            String[] input = {"delta", "alpha", "charlie", "alpha", "bravo"};
            String[] expected = {"alpha", "alpha", "bravo", "charlie", "delta"};

            // Act
            SortingUtility.cocktailShakerSort(input);

            // Assert
            assertArrayEquals(expected, input, "String array with duplicates should be sorted lexicographically.");
        }








        //SHELL SORT TESTS
        // 1. Empty array
        @Test
        @DisplayName("shellSort: empty Integer array should remain empty")
        public void testShellSortEmptyArrayReturnsEmptyArray() {
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
        public void testShellSortSingleElementArrayRemainsUnchanged() {
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
        public void testShellSortTwoElementArrayAlreadySortedRemainsUnchanged() {
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
        public void testShellSortTwoElementArrayUnsortedGetsSortedAscending() {
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
        public void testShellSortAlreadySortedAscendingArrayRemainsUnchanged() {
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
        public void testShellSortReverseSortedArrayGetsSortedAscending() {
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
        public void testShellSortAllDuplicateElementsRemainsLogicallyUnchanged() {
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
        public void testShellSortArrayWithSomeDuplicatesGetsSortedAscending() {
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
        public void testShellSortRandomUnsortedIntegerArrayGetsSortedAscending() {
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
        public void testShellSortSingleElementStringArrayRemainsUnchanged() {
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
        public void testShellSortUnsortedStringArrayGetsSortedLexicographically() {
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
        public void testShellSortStringArrayWithDuplicatesGetsSortedLexicographically() {
            // Arrange: String array with repeated values
            String[] input = {"delta", "alpha", "charlie", "alpha", "bravo"};
            String[] expected = {"alpha", "alpha", "bravo", "charlie", "delta"};

            // Act: shellSort should correctly handle duplicate Strings
            SortingUtility.shellSort(input);

            // Assert: array is sorted and duplicates are grouped
            assertArrayEquals(expected, input, "String array with duplicates should be sorted lexicographically by shellSort.");
        }
    }










# Project:  Sorting Things Out

This project is all about implementing a sorting algorithm utility class.  You're going to start with a SortingUtility class that has been pre-populated with method headers (so you know what your input and output are supposed to be), as well as a driver class you can utilize to test your algorithm (it's similar to the one we used in our previous sorting activity).

Steps to Complete Project

Fork the project template at https://github.com/UltimateSandbox/project-5-initial.git 
Clone project locally into your IDE.
Look at the 3 TODOs in the TODO tab.
Implement part A (details below) and test it with the driver.
Implement part B (details below) and test it with the driver.
Implement part C (details below) and test it with the driver.
Parts A is worth 50 points, Part B is worth 75 points, and Part C is extra credit worth 75 points.
Turn in your assignment link in Canvas.
To receive 100%, you must use the same variable names that are used in the pseudo code.

Note:  The SortingUtility class already has a swap method that you can utilize where appropriate.

Part A is a Gnome Sort that uses iteration to achieve a sorting of Comparable objects.

Pseudo Code

procedure gnomeSort(a[]):
pos := 0
while pos < length(a):
if (pos == 0 or a[pos] >= a[pos-1]):
pos := pos + 1
else:
swap a[pos] and a[pos-1]
pos := pos - 1

Additional info can be found at:

https://en.wikipedia.org/wiki/Gnome_sort

Part B is a Cocktail Shaker Sort, which is a modified type of bubble sort to sort Comparable objects.

Pseudo Code

procedure cocktailShakerSort(A : list of sortable items) is
do
swapped := false
for each i in 0 to length(A) − 1 do:
if A[i] > A[i + 1] then // test whether the two elements are in the wrong order
swap(A[i], A[i + 1]) // let the two elements change places
swapped := true
end if
end for
if not swapped then
// we can exit the outer loop here if no swaps occurred.
break do-while loop
end if
swapped := false
for each i in length(A) − 1 to 0 do:
if A[i] > A[i + 1] then
swap(A[i], A[i + 1])
swapped := true
end if
end for
while swapped // if no elements have been swapped, then the list is sorted
end procedure

Additional info can be found at:

https://en.wikipedia.org/wiki/Cocktail_shaker_sort

Part C is Extra Credit and is not required.  It is worth an additional 50 points and is a Shell Sort.

Hint:  This one can be tricky - create 'gaps' as an ArrayList and fill it with the values in the pseudo code below.  Also, the input array is going to be of Comparable objects.  Look at our other work on sorting algorithms for hints on how to implement that.  Good luck with the rest!

Pseudo Code

# Sort an array a[0...n-1].
gaps = [701, 301, 132, 57, 23, 10, 4, 1]  # Ciura gap sequence
n = a[] length

# Start with the largest gap and work down to a gap of 1
# similar to insertion sort but instead of 1, gap is being used in each step
foreach (gap in gaps)
{
# Do a gapped insertion sort for every elements in gaps
# Each loop leaves a[0..gap-1] in gapped order
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

Additional info can be found at:

https://en.wikipedia.org/wiki/Shellsort






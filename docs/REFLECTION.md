ALGORITHM UNDERSTANDING:

Gnome Sort***

Variables: “pos” (int)
Loops: while loop

Algorithm logic: While the “pos” variable is less than the length of the array, an if-else loop 
which increments the position will sort the array. The if-else statement checks if the current value 
in the array is larger than the value before it, if that’s that case then no swap occurs and 
“pos” is incremented. If the current value isn’t greater than the value before it, then a swap 
within the array occurs and the position is decreased by one. Once the “pos” variable is equal 
to the length of the array the data set has been successfully sorted.



Cocktail Shaker Sort***

Variables: “swapped”(boolean), “i”(int)
Loops: do-while, for loop (X2)

Algorithm logic: Cocktail shaker works by walking through each element of the array and comparing 
the current value in the array with the next and swapping if the order isn’t correct from the start 
of the array (bottom) to the end (top). Then the array is walked through again from the top to the 
bottom and the order of the current value and the next is evaluated again. This pattern of sorting 
the dataset from bottom to top and top to bottom is repeated until the procedure encounters a pass 
where no values are swapped, this means the list has been sorted. This algorithm’s pattern mimics 
the motion of a cocktail shaker mixing drinks.




Shell Sort***

Variables: “gaps”(filled array), “n”(int), “i”(int), “temp”(array), “j”(int)
Loops: for(X2)

Algorithm logic: Shell sort works by utilizing a preset list of index gaps to compare values at 
varying distances and then performs a gapped insertion sort instead of swapping adjacent values. 
Each gap is used to partially sort the list, and as the gap is decreased the procedure compares 
values between smaller distances. The list appears sorted quicker since it can move values a 
greater distance. A final gap of 1 completes the sort.
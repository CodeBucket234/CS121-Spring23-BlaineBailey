Activity 25 uses merge sort to sort an array. Activity 25 has two classes.

Sorting.java uses a Scanner object for input. The getArray method gets 5 unsorted integers from the user and then returns the array. The sortArray method is a recursive method that divides up the array in halves, and then calls the merge function to help with merging the divided parts of the array. The merge function merges the divided portions of the array together and ensures that the numbers from the divided portions go in sorted. Then finally, the sortArray method returns the sorted array.

Main.java creates an instance of the sorting class, and then calls its getArray method. Then, the array is used for the sortArray method. The program returns a sorted array of 5 integers.

The hardest part of Activity 25 was implementing the merge sort because although I understood how it worked, I came upon several issues in how it worked, and I was unable to implement the merge sort. Once I finally figured that part out, there was a small error in how my code worked that caused the merge sort to not work correctly. I fixed that issue, and now the merge sort works.

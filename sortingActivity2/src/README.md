Activity 26 uses selection sort to sort an unsorted integer array. Activity 36 has two classes.

Sorting.java uses the Scanner class for user input. The getArray method prompts the user to enter in 5 unsorted integers, and then returns the array. The sortArray method uses selection sort to sort the unsorted array by swapping the current number with the minimum value after. The sortArray method starts at the beginning of the array, and continues to sort until the end of the array. The findMinIndex method is meant to help find the index of the minimum value after the index of the current number so that the current and minimum numbers can be swapped. The show method is meant to display the values in the array.

Main.java creates an instance of the sorting class, and then calls its getArray method. Then, the array is used for the sortArray method. The program then uses the show method to display the sorted array.

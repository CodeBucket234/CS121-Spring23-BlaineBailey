Activity 17 uses array lists to store data. Activity 17 has three classes stored in two packages.

CourseInfo.java is stored in the classArrayLists package, and has four instance array lists: course name String array list, gpa double array list, score integer array list, and letter grade character array list. The constructor creates the different array lists. The addItem(String course, double gpa, int score, char letter) method adds a course and course information to the array lists. The displayInfo() method displays all the course information.

TestClass.java is stored in the classArrayLists package, and uses the Scanner object for user input. This class creates an instance of the CourseInfo class, and then prompts the user to enter in the course information. The user would stop adding course information after they type "q", and only courses with complete data are added and displayed after the user is done.

StringArrayList.java is stored in the stringArrayList package, and creates a string array list to store pokemon names. Five strings are added to the array list, then the string at index 3 is removed. The .size() method is used to display the size of the array list, and then a for each loop is used to print out all the pokemon in the array list. Finally, a for loop is used to print out all the pokemon.

The hardest part of Activity 17 was the letter grade for CourseInfo.java because the array list is a character array list, but I could not convert the string that the user passed through into a character. I had to use the .charAt(0) method to actually store the characters.

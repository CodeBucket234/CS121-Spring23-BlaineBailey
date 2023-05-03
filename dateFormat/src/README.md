Activity 34 uses dates to calculate the number of calories consumed with a diet of a certain number of daily calories between the starting and ending dates of the diet. Activity 34 has two classes.

TotalCalories.java has one private instance variable: a SimpleDateFormat object called dateFormat. This object will be used to convert user-given strings and convert them to dates. The one method in the class, calculateCalories, takes in the dates the user gives and the number of calories per day as arguments, and converts the user-given strings into dates. Then it calculates the difference between the dates, and returns the difference between the dates multiplied by the number of days, which represents the total number of calories consumed across the time period.

Main.java creates an instance of the TotalCalories class and a Scanner object for input. Then the program asks the user to provide input on the start and end dates of the diet, as well as the number of calories per day. Then the program uses the instance of the TotalCalories class to calculate the number of calories consumed total and displays the number of calories total throughout the duration of the diet.

The hardest part of this assignment was getting the amount of days between the start and end dates to calculate correctly because I realized I accidentally had the end date subtracted from the start date instead of the other way around. I was not able to catch the error by myself.
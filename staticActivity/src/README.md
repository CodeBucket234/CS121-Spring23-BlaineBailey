Activity 21 utilizes static variables and a static method to keep track of the number of instances of an object. Activity 21 has 2 classes.

Person.java has 3 private non-static instance variables: age, yearly income, and address, as well as 1 private static variable: number of people. The constructor creates a person with a custom age, income, and address, as well as adding one to the number of people. The getNumPeople() method returns the number of people.

Main.java creates 3 instances of the Person class, and uses all 3 instances to use the getNumPeople method.

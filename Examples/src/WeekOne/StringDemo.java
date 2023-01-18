package WeekOne;

public class StringDemo {
    public static void main(String[] args) {
        //Declaring and initializing variables
        String firstName = "John";
        String lastName = "Doe";
        String fullName = String.format("%s %s", firstName, lastName);
        int age = 20;
        double gpa = 3.8;
        char grade = 'A';
        String info = String.format("name: %s\nage: %d\ngpa: %.1f\ngrade: %c", fullName, age, gpa, grade);

        //Printing out variables
        System.out.println(fullName);
        System.out.println();
        System.out.println(info);
        System.out.println();


        //Different ways to use strings
        String name = "John" + " " + "Doe";

        //String.replace()
        System.out.printf("0. %s\n", name);
        System.out.printf("1. %s\n", name.replace("John", "Jane")); //Does not actually change the string
        System.out.printf("2. %s\n", name);
        name = name.replace("John", "Jane"); //Changes the value stored in name variable
        System.out.printf("3. %s\n\n", name); //name variable now hold different a different value.

        //String.length()
        System.out.printf("Number of characters: %d\n\n", name.length());

        //String.toUpperCase() and String.toLowerCase()
        System.out.printf("%s\n", name.toUpperCase());
        System.out.printf("%s\n", name.toLowerCase());
        System.out.printf("%s\n\n", name);

        //String.charAt(index)
        System.out.printf("Initials: %s.%s.\n\n", name.charAt(0), name.charAt(5));

        //String.substring(beginning index, ending index)
        System.out.printf("First name: %s\nLast name: %s\n\n", name.substring(0,4), name.substring(5,8));
    }
}

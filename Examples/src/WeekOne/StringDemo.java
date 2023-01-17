package WeekOne;

public class StringDemo {
    public static void main(String[] args) {
        //Declaring and initializing variables
        int age = 20;
        double gpa = 3.8;
        char letterGrade = 'A';
        boolean csMajor = true;
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        String fullName2 = String.format("");
        String info = String.format("Name: %s, age: %d, gpa: %.1f, grade: %c", fullName, age, gpa, letterGrade);

        //Printing out variables
        System.out.println(fullName);
        System.out.println("");
        System.out.println(String.format("%s %s", firstName, lastName));
        System.out.println("");
        System.out.println("Name: " + fullName + ", age: " + age + ", gpa: " + gpa + ", grade: " + letterGrade);
        System.out.println("");
        System.out.println(info);
    }
}

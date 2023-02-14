//**********************************************************************************************************************
// Activity 12: Classes
// Name: Blaine Bailey
// Date of Submission: 2/14/2023
//**********************************************************************************************************************
// This is the Person class that creates people with a name, job title, home address, and salary using the constructor.
// This class has methods for changing the person's occupation and salary, changing the home address of the person, and
// displaying their information.
//**********************************************************************************************************************
public class Person {
    //Initialize instance variables
    String name;
    String occupation;
    String address;
    double salary;

    //Person constructor that creates a new person with a name, job title, home address, and salary
    public Person(String name, String jobTitle, String homeAddress, double salary) {
        this.name = name;
        this.occupation = jobTitle;
        this.address = homeAddress;
        this.salary = salary;
    }

    //Changes person's job title and salary
    public void changeJob(String newJob, double newSalary) {
        this.occupation = newJob;
        this.salary = newSalary;
    }

    //Changes person's home address
    public void changeAddress(String newAddress) {
        this.address = newAddress;
    }

    //Displays person's information
    public void displayInformation() {
        System.out.printf("This person's name is: %s\n", this.name);
        System.out.printf("%s's home address is: %s\n", this.name, this.address);
        System.out.printf("%s's occupation is: %s\n", this.name, this.occupation);
        System.out.printf("%s's salary is $%.2f\n", this.name, this.salary);
    }
}

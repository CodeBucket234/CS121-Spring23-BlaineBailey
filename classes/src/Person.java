public class Person {
    String name;
    String occupation;
    String address;
    double salary;

    public Person(String name, String jobTitle, String homeAddress, double salary) {
        this.name = name;
        this.occupation = jobTitle;
        this.address = homeAddress;
        this.salary = salary;
    }

    public void changeJob(String newJob, double newSalary) {
        this.occupation = newJob;
        this.salary = newSalary;
    }

    public void changeAddress(String newAddress) {
        this.address = newAddress;
    }

    public void displayInformation() {
        System.out.printf("This person's name is: %s\n", this.name);
        System.out.printf("%s's home address is: %s\n", this.name, this.address);
        System.out.printf("%s's occupation is: %s\n", this.name, this.occupation);
        System.out.printf("%s's salary is $%.2f\n", this.name, this.salary);
    }
}

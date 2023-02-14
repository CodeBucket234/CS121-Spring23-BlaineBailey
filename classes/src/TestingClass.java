public class TestingClass {
    public static void main(String[] args) {
        //Testing BankAccount Class
        System.out.println("----------Testing BankAccount Class----------");
        //Creating John's bank account
        BankAccount John = new BankAccount("John", 5000, 0.055);

        System.out.println("John made a new bank account. Here is his new bank account information.");

        //Show John's original information
        John.accessInformation();

        //Test the other BankAccount methods
        John.deposit(1200);
        John.withdraw(1500);
        John.addInterest();
        John.changeRate(0.08);

        //Display John's new bank account information
        System.out.println("\nJohn has had new activity on his account lately. Let's check his new information.");
        John.accessInformation();

        //Now testing Person Class
        System.out.println("\n----------Testing Person Class----------");
        //Creating Stacy the person
        Person Stacy = new Person("Stacy", "Software Developer", "18095 Applewood Rd.", 75000);

        //Show Stacy's original information
        System.out.println("We just created Stacy the person. Let's check her out.");
        Stacy.displayInformation();

        //Testing other Person methods
        Stacy.changeAddress("24056 Blossom Street");
        Stacy.changeJob("Unemployed", 0);

        //Display Stacy's new 
        System.out.println("\nIt has been a year since we last seen Stacy. Let's check on her now.");
        Stacy.displayInformation();
    }
}

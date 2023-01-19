package WeekTwo;

import java.util.Scanner;
//************************************************************
//  Activity #1
//  Name: Blaine Bailey
//  Date of submission:
//************************************************************
//  The purpose of the program is to get input of a user's
//  name, and then print out their name in three different
//  ways: UPPERCASE, lowercase, and reverse.
//
//
//************************************************************
public class UserName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your first name?: ");
        String firstName = input.nextLine();
        System.out.print("What is your last name?: ");
        String lastName = input.nextLine();

        String fullName = String.format("%s %s", firstName, lastName);

        String fullNameUpper = fullName.toUpperCase();
        String fullNameLower = fullName.toLowerCase();
        System.out.println(fullNameUpper);
        System.out.println(fullNameLower);
        System.out.println(reverse(fullName));
    }
    public static String reverse(String name) {
        String newName = "";
        for(int i = name.length()-1; i >= 0; i--) {
            newName += name.charAt(i);
        }
        return newName;
    }
}

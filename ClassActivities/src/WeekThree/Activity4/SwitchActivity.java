package WeekThree.Activity4;
//Importing Scanner class
import java.util.Scanner;
//**********************************************************************************************************************
// Activity 4: Switch Activity
// Name: Blaine Bailey
// Date of Submission: 1/29/2023
//**********************************************************************************************************************
// To use this program:
// Click the green arrow, then enter a planet from our solar system. Our program is case-insensitive. If you enter a
// planet from our solar system, then it will display a bunch of facts about the planet, and provide a link citation to
// the website with the information. If you do not enter a planet from our solar system, then you will be given an
// error message.
//**********************************************************************************************************************
// This program uses the Scanner class for input.
//**********************************************************************************************************************
// CITATIONS:
//     https://space-facts.com/mercury/
//     https://space-facts.com/venus/
//     https://space-facts.com/earth/
//     https://space-facts.com/mars/
//     https://space-facts.com/jupiter/
//     https://space-facts.com/saturn/
//     https://space-facts.com/uranus/
//     https://space-facts.com/neptune/
//**********************************************************************************************************************

public class SwitchActivity {
    public static void main(String[] args) {
        //Creating scanner object
        Scanner input = new Scanner(System.in);

        //Prompt user to enter in a planet
        System.out.print("Enter in a planet from our solar system: ");
        String planet = input.nextLine();
        planet = planet.toLowerCase();

        //Check to see which planet the user entered
        //Display information for the corresponding planet
        switch(planet) {
            case "mercury":
                System.out.println("\nThe diameter of Mercury is 4,879 km.");
                System.out.println("The mass of Mercury is: 3.29 × 10^23 kg.");
                System.out.println("Mercury has no moons.");
                System.out.println("Mercury has no rings.");
                System.out.println("The orbit distance of Mercury is: 57,909,227 km (0.39 AU).");
                System.out.println("A year on Mercury lasts 88 Earth days.");
                System.out.println("The surface temperature range of Mercury goes from -173°C to 427°C (-279.4°F to 800.6°F).");
                System.out.println("Mercury is the first planet from the sun in our solar system.");
                System.out.println("\nThese facts came from the following website:");
                System.out.println("\thttps://space-facts.com/mercury/");
                break;
            case "venus":
                System.out.println("\nThe diameter of Venus is 12,104 km.");
                System.out.println("The mass of Venus is: 4.87 × 10^24 kg.");
                System.out.println("Venus has no moons.");
                System.out.println("Venus has no rings.");
                System.out.println("The orbit distance of Venus is: 108,209,475 km (0.73 AU).");
                System.out.println("A year on Venus lasts 255 Earth days.");
                System.out.println("The surface temperature of Venus is 462°C (863.6°F).");
                System.out.println("Venus is the second planet from the sun in our solar system.");
                System.out.println("\nThese facts came from the following website:");
                System.out.println("\thttps://space-facts.com/venus/");
                break;
            case "earth":
                System.out.println("\nThe diameter of Earth is 12,756 km.");
                System.out.println("The mass of Earth is: 5.97 × 10^24 kg.");
                System.out.println("Earth has 1 moon.");
                System.out.println("Earth has no rings.");
                System.out.println("The orbit distance of Earth is: 149,598,262 km (1 AU).");
                System.out.println("A year on Earth lasts 365.24 Earth days.");
                System.out.println("The surface temperature range of Earth goes from -88°C to 58°C (-126.4°F to 136.4°F).");
                System.out.println("Earth is the third planet from the sun in our solar system.");
                System.out.println("\nThese facts came from the following website:");
                System.out.println("\thttps://space-facts.com/earth/");
                break;
            case "mars":
                System.out.println("\nThe diameter of Mars is 6,792 km.");
                System.out.println("The mass of Mars is: 6.39 × 10^23 kg.");
                System.out.println("Mars has 2 moons.");
                System.out.println("Mars has no rings.");
                System.out.println("The orbit distance of Mars is: 227,943,824 km (1.38 AU).");
                System.out.println("A year on Mars lasts 687 Earth days.");
                System.out.println("The surface temperature range of Mars goes from -87°C to -5°C (-124.6°F to 23°F).");
                System.out.println("Mars is the fourth planet from the sun in our solar system.");
                System.out.println("\nThese facts came from the following website:");
                System.out.println("\thttps://space-facts.com/mars/");
                break;
            case "jupiter":
                System.out.println("\nThe diameter of Jupiter is 142,984 km.");
                System.out.println("The mass of Jupiter is: 1.90 × 10^27 kg.");
                System.out.println("Jupiter has 79 moons.");
                System.out.println("Jupiter has 4 rings.");
                System.out.println("The orbit distance of Jupiter is: 778,340,821 km (5.20 AU).");
                System.out.println("A year on Jupiter lasts 4,333 Earth days.");
                System.out.println("The surface temperature of Jupiter is -108°C (-162.4°F).");
                System.out.println("Jupiter is the fifth planet from the sun in our solar system.");
                System.out.println("\nThese facts came from the following website:");
                System.out.println("\thttps://space-facts.com/jupiter/");
                break;
            case "saturn":
                System.out.println("\nThe diameter of Saturn is 120,536 km.");
                System.out.println("The mass of Saturn is: 5.68 × 10^26 kg.");
                System.out.println("Saturn has 82 moons.");
                System.out.println("Saturn has over 30 rings.");
                System.out.println("The orbit distance of Saturn is: 1,426,666,422 km (9.58 AU).");
                System.out.println("A year on Saturn lasts 10,756 Earth days.");
                System.out.println("The surface temperature of Saturn is -139°C (-218.2°F).");
                System.out.println("Saturn is the sixth planet from the sun in our solar system.");
                System.out.println("\nThese facts came from the following website:");
                System.out.println("\thttps://space-facts.com/saturn/");
                break;
            case "uranus":
                System.out.println("\nThe diameter of Uranus is 51,118 km.");
                System.out.println("The mass of Uranus is: 8.68 × 10^25 kg.");
                System.out.println("Uranus has 27 moons.");
                System.out.println("Uranus has 13 rings.");
                System.out.println("The orbit distance of Uranus is: 2,870,658,186 km (19.22 AU).");
                System.out.println("A year on Uranus lasts 30,687 Earth days.");
                System.out.println("The surface temperature of Uranus is -197°C (-322.6°F).");
                System.out.println("Uranus is the seventh planet from the sun in our solar system.");
                System.out.println("\nThese facts came from the following website:");
                System.out.println("\thttps://space-facts.com/uranus/");
                break;
            case "neptune":
                System.out.println("\nThe diameter of Neptune is 49,528 km.");
                System.out.println("The mass of Neptune is: 1.02 × 10^26 kg.");
                System.out.println("Neptune has 14 moons.");
                System.out.println("Neptune has 5 rings.");
                System.out.println("The orbit distance of Neptune is: 4,498,396,441 km (30.10 AU).");
                System.out.println("A year on Neptune lasts 60,190 Earth days.");
                System.out.println("The surface temperature of Neptune is -201°C (-329.8°F).");
                System.out.println("Neptune is the eighth and final planet from the sun in our solar system.");
                System.out.println("\nThese facts came from the following website:");
                System.out.println("\thttps://space-facts.com/neptune/");
                break;
            //If the user does not provide a planet from the solar system, give an error message
            default:
                System.out.println("You did not enter a planet from our solar system.");
        }
    }
}
